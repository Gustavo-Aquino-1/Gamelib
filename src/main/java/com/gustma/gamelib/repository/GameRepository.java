package com.gustma.gamelib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gustma.gamelib.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {

}
