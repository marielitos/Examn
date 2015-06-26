/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import interfaz.Mensajes;
import interfaz.frListaArticulos;

/**
 *
 * @author Hime
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try
        {
        frListaArticulos ventana = new frListaArticulos();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        }
        catch(Exception ex)
        {
            Mensajes.instance.mostrarMensaje("Error fatal", "Ocurrio un error y es imposible que el sistema siga operando.", 0);
        }
        
    }
    
}
