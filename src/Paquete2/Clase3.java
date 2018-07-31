/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete2;
import Paquete1.Clase1; // importamos el paquete yt clase del paquete que vamos a usar

/**
 *
 * @author Edgar Andress Delgado
 */
public class Clase3 {
    public static void main(String[] args) {
          Clase1 objeto1 = new Clase1();
          int c2 = objeto1.valor; // pasamos primero el objeto de la clase y luego el atributo
          System.out.println("el valor es " + c2 );
    }
  
    
}
