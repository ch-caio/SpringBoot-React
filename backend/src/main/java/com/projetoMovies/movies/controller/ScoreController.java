package com.projetoMovies.movies.controller;

import com.projetoMovies.movies.DTO.MovieDTO;
import com.projetoMovies.movies.DTO.ScoreDTO;
import com.projetoMovies.movies.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @PutMapping
    public MovieDTO SaveScore(@RequestBody ScoreDTO scoreDTO) {
        MovieDTO movieDTO = scoreService.saveScore(scoreDTO);
        return  movieDTO;
    }
}
