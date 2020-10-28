package com.dekopi.solutions.hotelharrinson.repository;

import com.dekopi.solutions.hotelharrinson.entity.TipoHabitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoHabitacionRepository extends JpaRepository<TipoHabitacion, Long> {


}
