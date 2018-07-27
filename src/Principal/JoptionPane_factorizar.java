
package Principal;

import javax.swing.JOptionPane;

/**
 *
 * @author Edgar Andres Delgado Castellano
 */
public class JoptionPane_factorizar {
    public static void main(String[] args) {
        double numero =Double.parseDouble(JOptionPane.showInputDialog("introduzca un numero para sacarle la raiz"));
       double numero2;// creamos otra variable que guarde la raiz
        numero2= Math.sqrt(numero);
        System.out.println("El resultado de la raiz del "+ numero +" Es ");// esta sentencia se une con la de abajo
        System.out.printf("%1.3f",Math.sqrt(numero));// es la forma par reducir los decimales
       
 
    }
    
}
