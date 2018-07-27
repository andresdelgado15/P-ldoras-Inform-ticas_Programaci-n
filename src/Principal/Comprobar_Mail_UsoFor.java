
package Principal;

import javax.swing.JOptionPane;

/**
 *
 * @author Edgar Andres Delgado
 */
public class Comprobar_Mail_UsoFor {      
    /*
    validar si una direcion de correo es correcta o no con tru o false 
    ===================================================================
    crear si dentro del texto esta o no el arroba, lo ponemos falso por que hasta el momento no hay nada
    crear el string con joption para que introdusca el mail
    creamos el for con una peculiaridad de la longitud de la variable declarada 
    imprimir en pantalla la longitud de la cadena
    creamos las condiciones para que mire si existe o no un arroba como tqambien el .com o .es
    luego le decimos a esa condicion que true por que el el mail o correo existe un arroba
    creamos la condicion si el arroba se encuentra dentro del correo  es correcto 
    SIno pues le decimos que es incorrecto
    eso lo hacemos cuando el caracter sale del bucle
    
  
    */
    public static void main(String[] args) { 
           
      int arroba =0;// creamos un boolean para saber si existe o no un @
        String correo;
        boolean punto=false;
        correo=JOptionPane.showInputDialog("INGRESE SU CORREO POR FAVOR");// ingresamos el mensaje
        for (int i = 0; i < correo.length(); i++) {
            if (correo.charAt(i)=='@') {
                arroba++;// creamos un contador para definir que no exista mas de un @
            }
            // podriamos declarar varios if para que se cumplan esa condicion
            if (correo.charAt(i)=='.') {
                punto=true;// creamos una variable boolean para determinar si existe o  no un punto en el arreglo
                
            }
            
        }if (arroba==1 && punto==true) {// unimos la condicion con un if para determinar que sea valida
            JOptionPane.showMessageDialog(null, "El correo es CORRECTO");
            
        }
        else{
                  JOptionPane.showMessageDialog(null, "El correo NO ES CORRECTO");
                }
  
   
   
   
}
}
