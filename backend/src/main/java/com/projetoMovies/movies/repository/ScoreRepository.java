package com.projetoMovies.movies.repository;

import com.projetoMovies.movies.entities.Score;
import com.projetoMovies.movies.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
