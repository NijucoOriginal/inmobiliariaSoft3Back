package com.example.demo.domain;


import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

@NotEmpty
@NotBlank
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DocumentoImportante {

    @PastOrPresent
    private LocalDateTime fechaExpedicion;

    @FutureOrPresent
    private LocalDateTime fechaVencimiento;

    private String descripcion;

    private int id;
    
}
