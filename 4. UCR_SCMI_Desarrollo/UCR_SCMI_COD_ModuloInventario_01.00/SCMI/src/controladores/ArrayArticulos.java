/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.ArrayList;
import java.util.List;
import objetos.Articulo;

/**
 *
 * @author Hime
 */
public class ArrayArticulos {

    private List<Articulo> articulos;

    public static ArrayArticulos instance = new ArrayArticulos();

    private ArrayArticulos() {
        articulos = new ArrayList<>();
        Articulo a0 = new Articulo("R21921921", "Limon", "fruta", 20.9, 50.9, "IGV", 10.3, "Percepción IGV", 10.3, 90, 30, ArrayProveedores.getIntancia().devolverProveedor(0), "El limon es acido", "Estados Unidos", false, true);
        Articulo a1 = new Articulo("R21921922", "Frijoles", "fruta", 20.9, 50.9, "IGV", 10.3, "Percepción IGV", 10.3, 90, 30, ArrayProveedores.getIntancia().devolverProveedor(1), "El frijol causa pedos", "Estados Unidos", false, true);
        Articulo a2 = new Articulo("R21921923", "Papaya", "fruta", 20.9, 50.9, "IGV", 10.3, "Percepción IGV", 10.3, 90, 30, ArrayProveedores.getIntancia().devolverProveedor(2), "La papaya ayuda al  estrenimiento", "Estados Unidos", false, true);
        Articulo a3 = new Articulo("R21921924", "Manzana", "fruta", 20.9, 50.9, "IGV", 10.3, "Percepción IGV", 10.3, 90, 30, ArrayProveedores.getIntancia().devolverProveedor(0), "La manzana no ayuda en nada pero es deliciosa", "Estados Unidos", false, true);
        articulos.add(a0);
        articulos.add(a1);
        articulos.add(a2);
        articulos.add(a3);
    }

    public static ArrayArticulos getIntancia() {
        return instance;
    }

    public void insertarArticulos(Articulo a) throws Exception {
        for (Articulo articulo : articulos) {
            if (articulo.getUPC().equals(a.UPC)) {
                throw new Exception("El codigo del articulo ya se encuentra en el inventario");
            }
        }
        articulos.add(a);
    }

    public void eliminarArticulos(Articulo articulo) {
        articulos.remove(articulo);
    }

    public Articulo devolverArticulo(int indice) {
        return articulos.get(indice);
    }

    //Buscr el articulo por nombre
    public Object[] buscarArticulo(String nombre) {
        List<Articulo> temp = new ArrayList<>();
        articulos.stream().filter((articulo) -> (articulo.getNombre().trim().toUpperCase().contains(nombre.trim().toUpperCase()))).forEach((articulo) -> {
            temp.add(articulo);
        });
        return temp.toArray();
    }

    public Articulo buscarArticuloPorCodigo(String codigo) {
        for (Articulo articulo : articulos) {
            if (articulo.getUPC().equals(codigo)) {
                return articulo;
            }
        }
        return articulos.get(0);
    }

    public Object[] getArticulostoArray() {
        return articulos.toArray();
    }

}
