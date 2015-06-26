/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author Hime
 */
public class Mensajes {
    
    public static Mensajes instance = new Mensajes();
    
    private Mensajes(){
    }
    
    public static Mensajes getIntancia() {
        return instance;
    }
    
    /**
     * 
     * @param mensaje
     * @param titulo
     * @param tipo, 0 error, 1 informacion, 2 advertencia, 3 pregunta
     */
    public void mostrarMensaje(String mensaje, String titulo, int tipo)
    {
        JOptionPane.showMessageDialog(null, mensaje, titulo, tipo);
    }
}
