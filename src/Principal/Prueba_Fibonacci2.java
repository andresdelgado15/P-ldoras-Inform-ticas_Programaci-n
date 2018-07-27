package Principal;

/**
 *
 * @author Edgar Andres Delagado
 */
public class Prueba_Fibonacci2 {

    /*
    vamos hacer la sucesion de fibonacci
    es importante colocar los primeros tres valores de la serie
    para hacer el calculo correspondiente de los siguientes valores, tomando la 
    posicion del valor siguiente, y luego tomar la suma de esas dos variables en una nueva variable
     */
    public static void main(String[] args) {
        /*
        vamo a crear la sucesion de fibonacci, que consiste en
        la suma de los dos numeros anteriores
        */
        int n0=0;
        int n1=1;
        int n2=1;
        System.out.println("");
        System.out.println(n0);
        System.out.println(n1);
        for (int i = 0; i < 10; i++) {
            n0=n1; // dos numero anteriores
            n1=n2; // un numero anterior
            n2=n0+n1; // el resultado de la suma 
            
            System.out.println(n2);
            
            
        }
    }

  

}
