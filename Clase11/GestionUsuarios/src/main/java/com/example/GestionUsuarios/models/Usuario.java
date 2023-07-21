package com.example.GestionUsuarios.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data @AllArgsConstructor
public class Usuario {
    private Integer id;
    private String nombre;
    private String apellido;
    private String telefono;
    private  String email;
}
