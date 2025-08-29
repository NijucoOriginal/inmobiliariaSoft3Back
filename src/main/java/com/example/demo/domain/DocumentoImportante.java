package com.example.demo.domain;


import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDateTime;

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
}
