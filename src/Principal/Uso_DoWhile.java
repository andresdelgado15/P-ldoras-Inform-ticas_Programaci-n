
package Principal;

import javax.swing.JOptionPane;

/**
 *
 * @author Edgar Andres Delgado Castellano
 */
public class Uso_DoWhile {
    public static void main(String[] args) {
                int numero_Adivinar = (int) (Math.random() * 10);// generamos un math random para crear un numero aleatorio
        int numero = 0;
        int contador = 0;
       

      do{// ejecuta al menos una vez
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el # para adivinar el # de consola"));
            contador++;
          
            if (numero > numero_Adivinar== true) {
                JOptionPane.showMessageDialog(null, "El numero es mas pequeño");

            } else if (numero < numero_Adivinar == true) {
                JOptionPane.showMessageDialog(null, "El numero es mas Grande");

            } else if (numero == numero_Adivinar == true) {
                JOptionPane.showMessageDialog(null, "El numero ingresado es CORRECTO: \n"
                        + numero + "\n" + "EL NUMERO A ADIVINAR ES: \n"
                        + numero_Adivinar + "\n" + "Numero de intentos:  \n" + contador);

            }

        }
         while ((numero_Adivinar != numero== true));

        
        
        
    }

}

        
    
    

