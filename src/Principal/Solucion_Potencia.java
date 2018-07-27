
package Principal;
import javax.swing.*;
/**
 *
 * @author Edgar Andres Delgado
 */
public class Solucion_Potencia {
    public static void main(String[] args) {
       int numero;
    int potencia = 0 ;
    int resultado;
    numero= Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero")) ;
    potencia= Integer.parseInt(JOptionPane.showInputDialog("ingrese la potencia")) ;
        resultado=(int) Math.pow(numero, potencia);
       // System.out.println("el resultado es "+ resultado);
       JOptionPane.showMessageDialog(null, "el resulado es:  " +resultado);
    }
    
    
}
