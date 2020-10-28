package com.dekopi.solutions.hotelharrinson.repository;

import com.dekopi.solutions.hotelharrinson.entity.Nivel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NivelRepository extends JpaRepository<Nivel,Long> {
}
