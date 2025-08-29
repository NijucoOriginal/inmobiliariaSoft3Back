package com.example.demo.dtos;

import com.example.demo.domain.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

import java.util.ArrayList;

@NotBlank(message="el campo es requerido")
public record InmuebleRequest(String departamento,

                              Ubicacion ubicacion,

                              TipoNegocio tipoNegocio,

                              AgenteInmobiliario agenteAsociado,

                              ArrayList<DocumentoImportante> documentosImportantes,

                              TipoInmueble tipo,

                              @Positive(message = "debe introducir unas medidas validas")
                                  double medidas,

                              @Positive(message = "debe tener almenos una habitacion")
                                  int habitaciones,

                              @Positive(message = "debe tener almenos un baño")
                                  int banos,

                              String descripcion,

                              EstadoInmueble estado,

                              @Positive(message = "El precio debe ser mayor a 0")
                                  double precio,

                              EstadoTransaccion estadoTransa,

                              String ciudad) {
}
