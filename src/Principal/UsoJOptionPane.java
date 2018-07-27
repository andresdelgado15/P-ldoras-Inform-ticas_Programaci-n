package Principal;

import javax.swing.JOptionPane;

/**
 *
 * @author Edgar Andres Delgado Castellano
 */
public class UsoJOptionPane {

    public static void main(String[] args) {
        /*
        Declaramos las variables a utilizar 
         */
        String mensaje;
        int n1 = 0;
        int n2 = 0;
        
        int menu;// creamos la variable seleccion para, elegir las opciones del menu principal.
        

// DECLARAMOS LA VARIABLE COMO UN ENTERO PARA QUE PUEDA HACER LA SELECCION EN EL SWITCH
        menu = Integer.parseInt(JOptionPane.showInputDialog("Que deseas Hacer: \n"
                + "1. Sumar: \n"
                + "2. Restar : \n"
                + "3. Multiplicar: \n"));

        // LLAMAMOS EL PARAMETRO A TENER ENCUENTA PARA LA SELECCION DEL SWITCH
        switch (menu) {
            case 1:
                // CREAMOS UN IF PARA CONDICIONAR QUE SI Y SOLO SI HAGA ESTO SI LA SELECCION ES 1
                if (menu == 1) {
                    /*
                    HACEMOS LA CONVERSION O CASTING DEL NUMERO A ENTERO, 
                    DECLARANDO PRIMERO LA VARIABLE, CUANDO QUEREMOS PEDIR UN DATO AL USUARIO
                    ESTO ES PARA EL JOPTIONPANE.INPUTDIALOG
                    POR OTRO LADO
                    PARA MOSTRAR EL RESULTADO  SOLO DECALRAMOS EL RESULTADO SIN LLAMAR NINGUNGA VARIABLE 
                    ES DECIR NO LE ASIGNAMOS A UNA VARIABLE UN ASOLUCION 
                    SI NO PLANTEAMOS LA SOLUCION Y CONCATENAMOS, YA QUE ES SOLO UN MENSAJE POR PANTALLA
                     */

                    n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));//PEDIMOS LOS DATOS POR PANTALLA
                    n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));// PEDIMOS LOS DATOS POR PANTALLA CON JOPTION.INPUT
                    int resultadoSuma = n1 + n2;
                    JOptionPane.showMessageDialog(null, "El resultado de la suma es:  " + resultadoSuma);// MOSTRAMOS SOLO EL MENSAJE

                    break;

                }

            case 2:
                if (menu == 2) {

                    n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));//PEDIMOS LOS DATOS POR PANTALLA
                    n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));// PEDIMOS LOS DATOS POR PANTALLA CON JOPTION.INPUT
                    int resultadoResta = n1 - n2;
                    JOptionPane.showMessageDialog(null, "El resultado de la Resta es:  " + resultadoResta);// MOSTRAMOS SOLO EL MENSAJE

                    break;
                }

            case 3:
                if (menu == 3) {

                    n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));//PEDIMOS LOS DATOS POR PANTALLA
                    n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));// PEDIMOS LOS DATOS POR PANTALLA CON JOPTION.INPUT
                    int resultadoMultiplicacion = n1 * n2;
                    JOptionPane.showMessageDialog(null, "El resultado de la Multiplicaion es:  " + resultadoMultiplicacion);// MOSTRAMOS SOLO EL MENSAJE

                    break;
                }
            default:
                if (menu > 3) {
                    JOptionPane.showMessageDialog(null, "Esta Opcion no es valida");
                }

        }
    }
}
