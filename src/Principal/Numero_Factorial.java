
package Principal;


import javax.swing.*;
/**
 *
 * @author Edgar Andres Delgado
 */
public class Numero_Factorial {
    public static void main(String[] args) {
        /*
        vamos a imprimir un numero factorial,
        para ello declaramos un escanner
        y sacamos el factorial de ese numero
        */
        // en dado caso que no se calcule el factorial es por que sobre paso la cantidad que podia soportar el int
        int numero;// declaramos el numero que hay que ingresar
        int resultado=1;// declaramos el resultado por el que se puede multiplicar el numero 
      numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero  para calcular su factorial"));// pedimos el numero por pantalla

        for (int i = numero; i >0; i--) {// creamos el for para mostarar que existe una sucesion de numeros en loq ue tienne que multiplicarse paralegar al resultado
           resultado=resultado*i;
            
        }
      JOptionPane.showMessageDialog(null,"El resultado del factorial es: "+ resultado);
            
    }
    
}
