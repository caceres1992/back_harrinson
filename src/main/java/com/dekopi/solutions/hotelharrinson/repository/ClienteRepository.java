package com.dekopi.solutions.hotelharrinson.repository;

import com.dekopi.solutions.hotelharrinson.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
