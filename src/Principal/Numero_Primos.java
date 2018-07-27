package Principal;

import javax.swing.*;

/**
 *
 * @author Edgar Andres Delgado
 */
public class Numero_Primos {

    public static void main(String[] args) {
        int numero = 0;
    

        numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero ,para definir si es primo o no"));
  
       //int resultado_Uno;
        int resultado_Dos;
        int resultado_Tres;
        int resultado_Cinco;
        int resultado_Siete;
        int resultado_Once;
        int resultado_Trece;
        
     
        
        resultado_Dos = numero % 2;

        resultado_Tres = numero % 3;

        resultado_Cinco = numero % 5;
        
        resultado_Siete = numero % 7;
         resultado_Once = numero % 11;
        
         resultado_Trece = numero % 13;

        if ( resultado_Dos == 0 || resultado_Tres==1 || resultado_Cinco==0 || 
                resultado_Siete==0 || resultado_Once==0 ) {
            System.out.println(" No es un numero primo ");

        } else{
            
        
            System.out.println(" Es un numero primo");
        }

    }

}