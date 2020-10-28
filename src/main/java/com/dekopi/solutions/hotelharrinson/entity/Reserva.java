package com.dekopi.solutions.hotelharrinson.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Null;
import java.time.LocalDateTime;


@Entity
@Data
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.LAZY)
    private Habitacion habitacion;

    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;

    @ManyToOne
    @Null
    private Estacionamiento estacionamiento;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm")
    private LocalDateTime createdAt;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm")
    private LocalDateTime fechaInicio;
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm")
    private LocalDateTime fechaFinal;

    private String placa;
    private String estado;

    @PrePersist
    void Prepersist() {
        createdAt = LocalDateTime.now();
        estado = "PENDIENTE";

        if (placa.isEmpty()) {
            placa = "NO TIENE";
        }
    }

}
