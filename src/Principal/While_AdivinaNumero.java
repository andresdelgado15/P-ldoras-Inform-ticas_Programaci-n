

package Principal;
import java.util.*;

/**
 *
 * @author Edgar Andres Delgado
 */
public class While_AdivinaNumero {
    public static void main(String[] args) {
        int aleatorio=(int)(Math.random()*50);
        
        Scanner entrada = new Scanner (System.in);
        int numero =0;
        
        int intentos=0;
        
        while(numero != aleatorio){
            System.out.println("introduce un numero por favor");
            intentos ++;
            numero=entrada.nextInt();
            if (aleatorio< numero) {
                System.out.println("mas bajo");
            }else if (aleatorio>numero) {
                System.out.println("Mas alto");
                
            }
               
            }
         System.out.println("Correcto \n"+"numero de intento \n"+intentos);
        }
                
        
        
    }
    

