package com.projetoMovies.movies.service;

import com.projetoMovies.movies.DTO.MovieDTO;
import com.projetoMovies.movies.entities.Movie;
import com.projetoMovies.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Transactional()
    public Page<MovieDTO> findAll(Pageable pageable){
        Page<Movie> movieList = movieRepository.findAll(pageable);
        Page<MovieDTO> movieListPage = movieList.map(x -> new MovieDTO(x));
        return movieListPage;
    }

    @Transactional
    public MovieDTO findById (Long id){
        Movie movie = movieRepository.findById(id).get();
        MovieDTO movieDTO = new MovieDTO(movie);
        return movieDTO;
    }
}
