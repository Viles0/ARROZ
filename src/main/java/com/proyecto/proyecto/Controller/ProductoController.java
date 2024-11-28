package com.proyecto.proyecto.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

import com.proyecto.proyecto.Model.Producto;


@RestController
public class ProductoController {

    private List<Producto> productos = new ArrayList<>(
       Arrays.asList(new Producto(1234, "Coca-Cola", 3000, 100))
    );

    @GetMapping("/Productos")
    public List<Producto> getProductos(){
        return productos;
    }
    @GetMapping("/{nombre}")
    public Producto getuserid(@PathVariable String nombre){
        for (Producto c : productos){
            return c;
        }
        return null;
    }

    @PostMapping("/producto")
    public Producto postuser(@RequestBody Producto producto){
    productos.add(producto);
    return producto;
    }

    @PutMapping ("/producto")
    public Producto putUsuario(@RequestBody Producto producto){
        for(Producto u :productos){
            if(u.getIdProducto() == producto.getIdProducto()){
                u.setNombre(producto.getNombre());
                u.setValor(producto.getValor());
                u.setCantidad(producto.getCantidad());
                return u;
            }
        }
        return null;
    }

    @DeleteMapping("/{idProducto}")
    public Producto deleteUser(@PathVariable int idProducto){
        for(Producto u: productos){
            if (u.getIdProducto() == idProducto){
                productos.remove(idProducto);
                return u;
            }
        }
        return null;
    }
}
