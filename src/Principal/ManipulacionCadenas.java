
package Principal;

/**
 *
 * @author Edgar Andres Delgado Castellano
 */
public class ManipulacionCadenas {

    public static void main(String[] args) {
        String nombre;
        String nombre2;

        nombre = "Andres delgado";
        nombre2 = "andres Delgado";
        int longitud = nombre.length();// imprime la longitud del string o cadena
        //int posicion=nombre.charAt(5);// imprime la posicion 5 pero el valor en numero de la letra s

        System.out.println("Mi nombre es: \n" + nombre); 
        System.out.println("la longitud de la cadena es: \n" + longitud);// imprime la longitud del nombre
        System.out.println("la primera letra es la: " + nombre.charAt(0));// imprime un caracter de la cadena
        /*
        en la linea de abajo lo que queremos hacer es coger una parte de una gran cadena, como bien
        se dice es hacer subString de una candea que significa sustraer careacteres para volverla 
        una cadena mas pequeña
        */
        System.out.println("queremos extrar los datos apartir de la letra D hasta la A: \n" + nombre.substring(7, 12));
        System.out.println("estas dos variables son iguales: \n" + nombre.equals(nombre2));// mostramos si los dos variables son iguales, en este caso si lo son
        // el equalsIgnorecase dice si dos cadenas son iguales o diferentes sin importarle las mayusculas o minusculas
        System.out.println("las dos cadenas son iguales, no existe diferencia entre mayusculas y miniuculas : \n"+ nombre.equalsIgnoreCase(nombre2));
        System.out.println("La ultima letra es "+ nombre.charAt(longitud-1));// imprimer al letra final declarando una variable como la longitud total
    }

}
  