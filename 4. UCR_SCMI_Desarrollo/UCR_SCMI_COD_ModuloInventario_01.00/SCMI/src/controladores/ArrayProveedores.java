/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.ArrayList;
import java.util.List;
import objetos.Proveedor;

/**
 *
 * @author Hime
 */
public class ArrayProveedores {
    
    private List<Proveedor> proveedores;
    
    public static ArrayProveedores instance = new ArrayProveedores();

    private ArrayProveedores() {
        proveedores = new  ArrayList<>();
        Proveedor p0 = new Proveedor("McDonalds", "Estados Unidos de America");
        Proveedor p1 = new Proveedor("Burger King", "Estados Unidos de America");
        Proveedor p2 = new Proveedor("Wallmart", "Estados Unidos de America");
        Proveedor p3 = new Proveedor("Price Smart", "Estados Unidos de America");
        proveedores.add(p0);
        proveedores.add(p1);
        proveedores.add(p2);
        proveedores.add(p3);
    }

    public static ArrayProveedores getIntancia() {
        return instance;
    }

    public void insertarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    public Proveedor devolverProveedor(int indice) {
        return proveedores.get(indice);
    }
    
    //Buscr el proveedor por nombre
    public Proveedor buscarProveedor(String nombre) {
        for (Proveedor proveedor : proveedores) {
            if (nombre.equals(proveedor.getNombre())) {
                return proveedor;
            }
        }
    return null;
  }
    public int indiceProveedor(Proveedor p)
    {
        return proveedores.indexOf(p);
    }

    public List<Proveedor> getProveedores() {
        return proveedores;
    }
  
}
