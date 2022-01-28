package com.projetoMovies.movies.service;

import com.projetoMovies.movies.DTO.MovieDTO;
import com.projetoMovies.movies.DTO.ScoreDTO;
import com.projetoMovies.movies.entities.Movie;
import com.projetoMovies.movies.entities.Score;
import com.projetoMovies.movies.entities.User;
import com.projetoMovies.movies.repository.MovieRepository;
import com.projetoMovies.movies.repository.ScoreRepository;
import com.projetoMovies.movies.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ScoreService {

    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ScoreRepository scoreRepository;

    @Transactional
    public MovieDTO saveScore(ScoreDTO scoreDTO) {

        User user = userRepository.findByEmail(scoreDTO.getEmail());
        if (user == null) {
            user = new User();
            user.setEmail(scoreDTO.getEmail());
            user = userRepository.saveAndFlush(user);
        }

        Movie movie = movieRepository.findById(scoreDTO.getMovieId()).get();

        Score score = new Score();
        score.setMovie(movie);
        score.setUser(user);
        score.setValue(scoreDTO.getScore());

        score = scoreRepository.saveAndFlush(score);

        double sum = 0.0;
        for (Score s : movie.getScores()) {
            sum = sum + s.getValue();
        }

        double media = sum / movie.getScores().size();
        movie.setScore(media);
        movie.setCount(movie.getScores().size());
        movie = movieRepository.save(movie);
        return new MovieDTO(movie);
    }
}
