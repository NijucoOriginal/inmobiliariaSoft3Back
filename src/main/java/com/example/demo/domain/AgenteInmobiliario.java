package com.example.demo.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@NotEmpty
@NotBlank
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AgenteInmobiliario extends Empleado {
}
