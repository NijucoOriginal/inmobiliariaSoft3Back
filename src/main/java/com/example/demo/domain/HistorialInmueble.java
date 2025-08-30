package com.example.demo.domain;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import lombok.*;

import java.time.LocalDateTime;

@NotBlank
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HistorialInmueble {

    @PastOrPresent
    private LocalDateTime fechaInicio;

    @PastOrPresent
    private LocalDateTime fechaFin;

    private TipoNegocio tipoNegocio;

    private double precio;

    private String cambioPermutacion;

    private int idHistorial;
}
