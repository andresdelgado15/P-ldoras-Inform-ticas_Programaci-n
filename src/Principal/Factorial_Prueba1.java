
package Principal;
import javax.swing.*;


/**
 *
 * @author Edgar Andres Delgado
 */
public class Factorial_Prueba1 {
    /*
    vamos a imprimir el numero factorial con un For
    */
    public static void main(String[] args) {
        
        int resultado=1;
        int factorial =Integer.parseInt(JOptionPane.showInputDialog("ingrese su numero"));
        for (int i = factorial; i > 0; i--) {
            resultado=resultado*i;
            
        }
        JOptionPane.showMessageDialog(null, "el resultado es "+ resultado);
    }
}
