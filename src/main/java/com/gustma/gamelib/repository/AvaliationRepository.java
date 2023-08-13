package com.gustma.gamelib.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gustma.gamelib.model.Avaliation;

@Repository
public interface AvaliationRepository extends  JpaRepository<Avaliation, Integer>{
}
