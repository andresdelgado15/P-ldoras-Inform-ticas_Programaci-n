package Principal;

import java.util.Scanner;

/**
 *
 * @author Edgar Andres Delgado Castellano
 */
public class UsoSwitch {

    public static void main(String[] args) {
        // creamos el menu
        System.out.println("Que operacion quieres realizar: \n\n"
                + "============================================= \n"
                + "1. suma \n"
                + "2. Resta \n"
                + "3. Multiplicacion \n"
                + "4. Division \n");

        Scanner sc = new Scanner(System.in);// creamos el scanner para que lea por consola
        // para modificar el nombre de todas la variables es control  + R de (rename)S
        int variable1 = 0;
        int variable2 = 0;
        int suma;
        int resta;
        int multiplicacion;
        double division;
        int menu;// creamos la variable para la seleccion de lo que se quiere hacer

        menu = sc.nextInt();// creamos la variable menu para que tome esta como entrada de datos 
/*
        creamos un switch para el menu, es importante denotar que el switch 
        cuenta con un case ( caso)
        y con un break ( terminacion del caso)
         */

        switch (menu) {
            case 1:
                System.out.println("Ingrese el  valor 1 \n");
                variable1 = sc.nextInt();// ingresa o recibe datos por consola de la variable solicitada
                System.out.println("Ingre el valor 2 \n");
                variable2 = sc.nextInt();
                suma = variable1 + variable2;// hacemos la solucion del problema planteado
// imprimomos el resultado
                System.out.println("El resultado De la SUMA es: " + variable1 + " + " + variable2 + " = " + suma);
                break;
            case 2:
                System.out.println("Ingrese el  valor 1 \n");
                variable1 = sc.nextInt();
                System.out.println("Ingre el valor 2 \n");
                variable2 = sc.nextInt();
                resta = variable1 - variable2;

                System.out.println("El resultado De la RESTA es: " + variable1 + " - " + variable2 + " = " + resta);
                break;
            case 3:
                System.out.println("Ingrese el  valor 1 \n");
                variable1 = sc.nextInt();
                System.out.println("Ingre el valor 2 \n");
                variable2 = sc.nextInt();
                multiplicacion = variable1 * variable2;

                System.out.println("El resultado De la MULTIPLICACION es: " + variable1 + " * " + variable2 + " = " + multiplicacion);
                break;
            case 4:
                double n3 = 0;// es importante inicializar las variables
                double n4 = 0;

                System.out.println("Ingrese el  valor 1 \n");
                n3 = sc.nextDouble();// decimos que este parametro va hacer leido por consola
                System.out.println("Ingre el valor 2 \n");
                n4 = sc.nextDouble();
                division = n3 / n4;

                System.out.println("El resultado De la DIVISION es: " + n3 + " / " + n4 + " = " + division);
                break;
            default:// creamos un default para mostrar los limites del menu.
                if (menu > 4) {// creamos la condicion en donde mostramos el la selccion se sale del rango
                    System.out.println("El numero no se encuentra dentro de las posibilidades de seleccion");
                }
        }
    }
}
