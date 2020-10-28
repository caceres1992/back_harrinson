package com.dekopi.solutions.hotelharrinson.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "CLIENTES")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = ": es requerido")
    private String nombre;
    @NotNull(message = ": es requerido")
    private String apellido;

    @NotNull(message = ": es requerido")
    @Length(min = 8, max = 8, message = " : 8 digitos obligatorio")
    private String dni;

    @NotBlank(message = ": es requerido")
    @Email(message = ": No valido")
    private String correo;

    @Length(min = 9, max = 9, message = ": debe tener 9 digitos obligatorio")
    private String telefono;

    @ManyToOne(fetch = FetchType.LAZY)
    private Distrito distrito;

}
