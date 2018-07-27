
package Principal;

import javax.swing.JOptionPane;

/**
 *
 * @author Edgar Andres Delgado Castellano
 */
public class While_Contraseña2Opciones {
    public static void main(String[] args) {
               
        String registro = "";// creamos lo posibilidad de insertar la contraseña
        /*
        realizamos un while(mientras la condicion sea falsa repita la condicion
        de lo contrario salga del while y retorne que la contraseña es correcta
         */
        while (registro.equalsIgnoreCase("andres") == false && registro.equalsIgnoreCase("jennifer") == false ) {// generamos un equals para determinar la contraseña sea la misma que el usuario ingresa
            registro = JOptionPane.showInputDialog("Ingrese la contraseña de andres o jennifer");// creamos la ventana emergente
            if (registro.equalsIgnoreCase("andres") == false && registro.equalsIgnoreCase("jennifer") == false) {
                /*
                hasta que esta condicion no sea verdarera(true) no sale del bucle, 
                y lo que hace es repetir indefinidamente
                 */
                JOptionPane.showMessageDialog(null, "la contraseña es incorrecta");
            }
        }
        // se rompe el bucle cuando la condicion sea valida
        
        JOptionPane.showMessageDialog(null, "LA CONTRASEÑA ES CORRECTA, PUEDE INGRESAR");

    }

}
    
