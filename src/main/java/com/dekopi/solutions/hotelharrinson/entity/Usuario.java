package com.dekopi.solutions.hotelharrinson.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


@Entity
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = " Obligatorio")
    private String nombre;
    @NotBlank(message = " Obligatorio")
    private String apellido;
    @NotBlank(message = " Obligatorio")
    @Length(min = 8, max = 8, message = "obligatorio 8 digitos")
    private String dni;

    @NotBlank(message = " Obligatorio")
    @Email(message = " ingresar un correo valido")
    private String correo;

    @Length(min = 6, max = 9, message = "ingresar un telefono valido")
    @NotBlank(message = " Obligatorio")
    private String telefono;

    @OneToOne
    private Role role;
    private boolean estado;

    @PrePersist
    void Prepersit() {
        estado = true;
    }
}
