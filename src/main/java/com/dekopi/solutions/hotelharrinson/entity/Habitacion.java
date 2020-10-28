package com.dekopi.solutions.hotelharrinson.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class Habitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = " es requerido")
    private String nrHabitacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @NotNull(message = " No puede ser nulo")
    private Nivel nivel;

    @ManyToOne(fetch = FetchType.LAZY)
    @NotNull(message = " No puede ser nulo")
    private TipoHabitacion tipoHabitacion;

    private String estado;
}
