package com.bolsadeideas.springboot.form.app.models.entity;

import jakarta.validation.constraints.*;

public class Usuario {
    //@Pattern(regexp = "[0-9]{2}[.][0-9]{3}[.][0-9]{3}[-][A-Z]{1}")
    private String identificador;
    //@NotEmpty(message = "el nombre no puede ser vacio")
    private String nombre;
    @NotEmpty
    private String apellido;
    @NotBlank
    @Size(min=3, max=8)
    private String username;
    @NotEmpty
    private String password;
    @NotEmpty
    @Email(message = "correo con formato incorrecto")
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
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