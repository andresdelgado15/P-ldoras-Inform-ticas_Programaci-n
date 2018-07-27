

package Principal;
import javax.swing.*;
/**
 *
 * @author Edgar Andres Delgado Castellano
 */
public class Numero_Par_Impar {
    public static void main(String[] args) {
        int n1;
        n1=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO"));
        int n2=2;
    
             int resultado=n1%n2;
        
        if (resultado==0) {
            JOptionPane.showMessageDialog(null,"el numero es PAR: "+n1);
            
            
        }else{
            JOptionPane.showMessageDialog(null,"el numero es IMPAR: "+n1);
        }
    }
    
    }
