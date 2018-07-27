
package Principal;


/**
 *
 * @author Edgar Andres Delgado Castellano
 */
public class Calculo_Math {

    public static void main(String[] args) {
        /*
        esto lo hacemos para determinar la raiz de un numero double
         */
        double n1 = 16;
        double raiz = Math.sqrt(n1);// dentro del parentesis definimos que numero se le quiere sacar la raiz
        System.out.println("La raiz del numero " + +raiz);// imprimimos el numero.

        /*
         Para calcular el metodo de redonde de un numero
         le damos una variable de tipo decimal 
         */
        double n2 = 9.856114524;
        double respuesta = (int)Math.round(n2);
        System.out.println("El numero redondeado de "+n2+" Es : "+respuesta);
        /*
        esto es para determinar la potencia de un numero
        entonces declaramos dos variables
        n3= a la base del numero
        n4= exponente del numero
        luego generamos un casting para hacer cambio de variable sobre el 
        resultado final
         */
        double base = 5;
        double exponente=4;

        double resultado = (int)Math.pow(base, exponente);
        System.out.println("El numero "+ base +" Elevado a "+exponente+" Es: "+resultado);
        
        /*
        Determinamos un numero aleatroia de 1 a 10.
        */
//        double seleccion;
//        seleccion=Math.random(1,10);
        
    }

}
