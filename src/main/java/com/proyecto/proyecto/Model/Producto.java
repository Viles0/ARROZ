package com.proyecto.proyecto.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Producto {

    private int idProducto;
    private String nombre;
    private int Valor;
    private int Cantidad;
}
