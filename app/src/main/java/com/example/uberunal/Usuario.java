package com.example.uberunal;

public class Usuario {
    private String nombre;
    private int celular;
    private String correo;
    private String contraseña;
    private boolean estadoConductor;
    private boolean estadoVerificacion;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isEstadoConductor() {
        return estadoConductor;
    }

    public void setEstadoConductor(boolean estadoConductor) {
        this.estadoConductor = estadoConductor;
    }

    public boolean isEstadoVerificacion() {
        return estadoVerificacion;
    }

    public void setEstadoVerificacion(boolean estadoVerificacion) {
        this.estadoVerificacion = estadoVerificacion;
    }

    public Usuario( String nombre, int celular, String correo, String contraseña, boolean estadoConductor, boolean estadoVerificacion) {
        this.nombre = nombre;
        this.celular = celular;
        this.correo = correo;
        this.contraseña = contraseña;
        this.estadoConductor = estadoConductor;
        this.estadoVerificacion = estadoVerificacion;
    }
    public Usuario(String nombre, int celular, String correo, String contraseña, boolean estadoConductor) {
        this(nombre,celular,correo,contraseña,estadoConductor,false);
    }
    public Usuario(String nombre, int celular, String correo, String contraseña) {
        this(nombre,celular,correo,contraseña,false,false);
    }
}
