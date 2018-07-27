/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import javax.swing.JOptionPane;

/**
 *
 * @author USA
 */
public class FechaMesJenn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String registro = "";// creamos lo posibilidad de insertar la contraseña
        /*
        realizamos un while(mientras la condicion sea falsa repita la condicion
        de lo contrario salga del while y retorne que la contraseña es correcta
         */
        while (registro.equalsIgnoreCase("15/03/12") == false && registro.equalsIgnoreCase("15-03-12") == false ) {// generamos un equals para determinar la contraseña sea la misma que el usuario ingresa
            registro = JOptionPane.showInputDialog("ingrese la fecha en la que cumples MES con tu negrita");// creamos la ventana emergente
            if (registro.equalsIgnoreCase("15/03/12") == false && registro.equalsIgnoreCase("15-03-12") == false) {
                /*
                hasta que esta condicion no sea verdarera(true) no sale del bucle, 
                y lo que hace es repetir indefinidamente
                 */
                JOptionPane.showMessageDialog(null, "LA FECHA DEL MES NO ES CORRECTA");
            }
        }
        // se rompe el bucle cuando la condicion sea valida
        
        JOptionPane.showMessageDialog(null, "ES CORRECTO...JENNIFER Y ANDRES JUNTOS X SIEMPRES...TE AMO MUCHOOOO");

    }

}
    
