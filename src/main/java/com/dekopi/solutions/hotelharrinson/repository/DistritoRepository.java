package com.dekopi.solutions.hotelharrinson.repository;

import com.dekopi.solutions.hotelharrinson.entity.Distrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistritoRepository extends JpaRepository<Distrito,Long> {
}
