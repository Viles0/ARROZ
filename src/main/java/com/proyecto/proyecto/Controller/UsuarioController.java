package com.proyecto.proyecto.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.proyecto.proyecto.Model.Usuario;

@RestController
public class UsuarioController {

    private List<Usuario> Usuario = new ArrayList<>(
       Arrays.asList(new Usuario(1234, "Samuel", "Molina"))
    );

    @GetMapping("/Users")
    public List<Usuario> getUsuarios(){
        return usuarios;
    }
    @GetMapping("/{nombre}")
    public Usuario getuserid(@PathVariable String nombre){
        for (Usuario c : usuarios){
            return c;
        }
        return null;
    }

    @PostMapping("/usuario")
    public Usuario postuser(@RequestBody Usuario usuario){
    usuarios.add(usuario);
    return usuario;
    }
    @putMapping("usuario")
    public Usuario putusuario(@RequestBody Usuario usuario){
        for(Usuario u :usuarios){
            if(u.getidUser()==usuario.getIdUser){
                u.setNombre(usuario.getNombre());
                u.setApellido(usuario.getApellido());
                return u;
            }
        }
        return null;
    }
}
