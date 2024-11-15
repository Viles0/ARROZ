package com.proyecto.proyecto.Model;

public class Usuario {

    private int idUsuario;
    private String nombre;
    private String apellido;
    public int getidUsuario(){
        return idUsuario;
    }
    
    public Usuario(int idUsuario, String nombre, String apellido) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
