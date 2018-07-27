
package Principal;

/**
 *
 * @author Edgar Andres delgado
 */
public class Serie_Fibonacci {

    /*
    vamos hacer la sucesion de fibonacci
     */
    public static void main(String[] args) {

        int Primer_Numero = 0;//inicializamos la primera variable
        
        int Segundo_Numero = 1;// inicializamos la segunda variable
      
        int Calculo_Varible3 = 1;// colocamos el resultado de la variable numero n3
        
        // imprimimos en consola las primeras 3 variables de la serie de fibonacci
        System.out.println(Primer_Numero);// imprimimos en consola el valor de cero
        System.out.println(Segundo_Numero);// imprimimos el valor de 1 en consola
        System.out.println(Calculo_Varible3);// imprimimos el valor de 1 en consola
        
        for (int i = 0; i < 10; i++) {

            Primer_Numero = Segundo_Numero;// dos numeros anteriores
            Segundo_Numero = Calculo_Varible3;// un numero anterior
            Calculo_Varible3 = Primer_Numero + Segundo_Numero;// calculo 

            System.out.println(Calculo_Varible3);// imprimimos la sucesion de fibonacci
        }

    }

}
