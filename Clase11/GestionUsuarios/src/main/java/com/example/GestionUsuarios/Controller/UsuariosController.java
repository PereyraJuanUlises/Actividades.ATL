package com.example.GestionUsuarios.Controller;

import com.example.GestionUsuarios.models.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuariosController {
    List<Usuario> listaUsuarios = new ArrayList<>();
    Usuario user1 = new Usuario(1,"ulises","pereyra","123213","ulises@gmail");
    @GetMapping("/api/usuarios")
    public List<Usuario> mostrarUsuarios(Usuario usuario){

        return listaUsuarios;
    }
    @DeleteMapping("/api/usuarios/{id}")
    public void eliminarUsuario(@PathVariable String id){
        for(Usuario user: listaUsuarios){
            if(user.getId().toString().equals(id)){
                listaUsuarios.remove(user);
            }
        }
    }
    @PostMapping("/api/usuarios")
    public void agregarUsuario(@RequestBody Usuario userN){
        listaUsuarios.add(userN);
    }
}
