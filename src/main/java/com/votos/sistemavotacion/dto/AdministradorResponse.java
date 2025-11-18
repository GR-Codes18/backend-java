package com.votos.sistemavotacion.dto;

import lombok.Builder;
import lombok.Data;

/**
 * DTO (Data Transfer Object) para enviar datos del Administrador
 * al frontend, excluyendo información sensible como la contraseña.
 */
@Data
@Builder
public class AdministradorResponse {
    private Integer idAdmin;
    private String nombre;
    private String email;
    private String rol;
    private String regionAcceso;
    // No incluir la contraseña
}