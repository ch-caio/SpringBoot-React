package com.projetoMovies.movies.repository;

import com.projetoMovies.movies.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
