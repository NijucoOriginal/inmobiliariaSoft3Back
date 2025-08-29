package com.example.demo.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public record ClienteRequest(@NotBlank(message="Debe de ingresar su nombre")
                             String nombre,
                             @NotBlank(message="Debe de ingresar su apellido")
                             String apellido,
                             @Pattern(
                                     regexp = "^.{10}$",
                                     message = "Acuerdese que la cedula solo incluye 10 caracteres"
                             )
                             String documentoIdentidad,
                             @Email
                             String correoElectronico,
                             @Pattern(
                                     regexp = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
                                     message = "La contraseña debe tener al " +
                                             "menos una mayúscula, un número, un carácter especial y mínimo 8 caracteres"
                             )
                             String contrasenia) {
}
