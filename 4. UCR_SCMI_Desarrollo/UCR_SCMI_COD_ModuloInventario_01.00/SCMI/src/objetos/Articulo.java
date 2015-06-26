/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author Hime
 */
public class Articulo {
    public String UPC;
    public String nombre;
    public String categoria;
    public double costo;
    public double precioUnitario;
    public String impuesto1;
    public double impuesto1Cantidad;
    public String impuesto2;
    public double impuesto2Cantidad;
    public int cantidad;
    public int nivelReorden;
    public Proveedor proveedor;
    public String descripcion;
    public String localizacion;
    public boolean permitirDescripcionAlterna;
    public boolean tieneNumeroSerie;

    public Articulo() {
    }

    public Articulo(String UPC, String nombre, String categoria, double costo, double precioUnitario, String impuesto1, double impuesto1Cantidad, String impuesto2, double impuesto2Cantidad, int cantidad, int nivelReorden, Proveedor proveedor, String descripcion, String localizacion, boolean permitirDescripcionAlterna, boolean tieneNumeroSerie) {
        this.UPC = UPC;
        this.nombre = nombre;
        this.categoria = categoria;
        this.costo = costo;
        this.precioUnitario = precioUnitario;
        this.impuesto1 = impuesto1;
        this.impuesto1Cantidad = impuesto1Cantidad;
        this.impuesto2 = impuesto2;
        this.impuesto2Cantidad = impuesto2Cantidad;
        this.cantidad = cantidad;
        this.nivelReorden = nivelReorden;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
        this.localizacion = localizacion;
        this.permitirDescripcionAlterna = permitirDescripcionAlterna;
        this.tieneNumeroSerie = tieneNumeroSerie;
    }

    public String getUPC() {
        return UPC;
    }

    public void setUPC(String UPC) {
        this.UPC = UPC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getImpuesto1() {
        return impuesto1;
    }

    public void setImpuesto1(String impuesto1) {
        this.impuesto1 = impuesto1;
    }

    public double getImpuesto1Cantidad() {
        return impuesto1Cantidad;
    }

    public void setImpuesto1Cantidad(double impuesto1Cantidad) {
        this.impuesto1Cantidad = impuesto1Cantidad;
    }

    public String getImpuesto2() {
        return impuesto2;
    }

    public void setImpuesto2(String impuesto2) {
        this.impuesto2 = impuesto2;
    }

    public double getImpuesto2Cantidad() {
        return impuesto2Cantidad;
    }

    public void setImpuesto2Cantidad(double impuesto2Cantidad) {
        this.impuesto2Cantidad = impuesto2Cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getNivelReorden() {
        return nivelReorden;
    }

    public void setNivelReorden(int nivelReorden) {
        this.nivelReorden = nivelReorden;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isPermitirDescripcionAlterna() {
        return permitirDescripcionAlterna;
    }

    public void setPermitirDescripcionAlterna(boolean permitirDescripcionAlterna) {
        this.permitirDescripcionAlterna = permitirDescripcionAlterna;
    }

    public boolean isTieneNumeroSerie() {
        return tieneNumeroSerie;
    }

    public void setTieneNumeroSerie(boolean tieneNumeroSerie) {
        this.tieneNumeroSerie = tieneNumeroSerie;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
    
    

    @Override
    public String toString() {
        return "Cod: " + UPC + ", " + nombre;
    }


}
