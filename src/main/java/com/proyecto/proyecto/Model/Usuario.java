package com.proyecto.proyecto.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Usuario {

    private int idUsuario;
    private String nombre;
    private String apellido;
}
