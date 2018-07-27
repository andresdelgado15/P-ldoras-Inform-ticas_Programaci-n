package Principal;

/**
 *
 * @author EdGAR Andres Delgado
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        /*
         Imprimimos la edad otros operadores aritmeticos
         en donde nos permite ver los resultados en consola,
         por otro lado realizamos varias sentencias para definir las operacioens 
         que vamos a realizar
         */
        int a = 5;
        a = 6;// hacemos el cambio de la variable a para tome un nuevo valor
        int b = 10;
        int c = 20;
        int f1;
        int f2;
        int f3;

        f1 = a * b;// realizamos la multiplicacion
        f1 += 5;// incrementamos a f1 en 5 unidades 

        f2 = a + b;// guardamos la suma en una variable.
        f2++;// para realizar un incremento al restultado final 

        f3 = a + b + c;
        f3--;// imprimimos el decremento.

        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        double division = b / a;
        double modulo = a % b;
        int edad;
        edad = 25;// declaramos la edad y luego la imprimimos

        System.out.println("Operadores Aritmeticos/n");
        System.out.println("===========================");
        System.out.println("la suma es: " + suma);
        System.out.println("===========================");
        System.out.println("la resta es: " + resta);
        System.out.println("===========================");
        System.out.println("la multiplicacion es: " + multiplicacion);
        System.out.println("===========================");
        System.out.println("la division es: " + division);
        System.out.println("===========================");
        System.out.println("la modulo es: " + modulo);
        System.out.println("===========================");
        //System.out.println(edad);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

    }

}
