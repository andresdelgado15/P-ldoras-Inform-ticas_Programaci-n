
package Principal;


import javax.swing.*;


/**
 *
 * @author Edgar Andres Delgado Castellano
 */
public class Adivina_Numero {

    /*
    vamos hacer un juego en el que:
    1. existira un numero aleatorio, el cual adivinemos.
    2. la consola nos pedira que digitemos un numero.
    3. la consola nos dara pistas, si es mayor o menor el numero
    4. hara un bucle while que nos deje ver la informacion hasta que adivinemos el numero
    5. al final mostrara un mensaje que diga que lo hemos logrado.
    6.al final contara cuantos intentos tuvimos que hacer para adivinar el numero
     */
    public static void main(String[] args) {
        int numero_Adivinar = (int) (Math.random() * 10);// generamos un math random para crear un numero aleatorio
        int numero = 0;// creamos las variables para adivinar
        int contador = 0;// creamos un contador
       

        while ((numero_Adivinar != numero== true)) {
            // pedimos el dato por pantalla
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el # para adivinar el # de consola"));
            contador++;// generamos el contador
          
            if (numero > numero_Adivinar== true) {// colocamos los parametros para que se haga valida la condicion
                JOptionPane.showMessageDialog(null, "El numero es mas pequeño");// mostramos el mensaje

            } else if (numero < numero_Adivinar == true) {// definimos si el numero es mayor
                JOptionPane.showMessageDialog(null, "El numero es mas Grande");

            } else if (numero == numero_Adivinar == true) {// definimos si el valor es menor
                /*
                // por ultimoo imprimimos los resultados por medio de un mensaje 
                de joption como tambien imprimimos el contador para saber cuantos
                intentos hicimos para adivinar  el numero aleatorio
                */
                
                JOptionPane.showMessageDialog(null, "El numero ingresado es CORRECTO: \n"
                        + numero + "\n" + "EL NUMERO A ADIVINAR ES: \n"
                        + numero_Adivinar + "\n" + "Numero de intentos:  \n" + contador);

            }

        }

    }

}
