package com.dekopi.solutions.hotelharrinson.repository;

import com.dekopi.solutions.hotelharrinson.entity.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitacionRepository extends JpaRepository<Habitacion,Long> {
}
