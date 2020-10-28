package com.dekopi.solutions.hotelharrinson.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Data
public class TipoHabitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = " Obligatorio")
    private String nombre;
    @NotBlank(message = " Obligatorio")
    @Min(value = 1)
    private double precio;
}
