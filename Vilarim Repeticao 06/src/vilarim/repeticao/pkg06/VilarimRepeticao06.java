
package vilarim.repeticao.pkg06;

import javax.swing.JOptionPane;

public class VilarimRepeticao06 {

    public static void main(String[] args) {
       
        int num; num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero para saber se ele é PRIMO ou NÃO"));
        int i = 1, j=1; 
        
        if (num > 0) {
            while (i <= num ){
                if (num % i == 0 ){ 
                    j++;
                }
                i++;
            } 
            
                if (j==3){
                    JOptionPane.showMessageDialog(null,"o numero " + num + " é primo");
                }
                else {
                    JOptionPane.showMessageDialog(null,"o numero " + num + " não é primo");
                }
        }
        else {
            JOptionPane.showMessageDialog(null,"valor negativo ou igual a zero");
  
    }
    
}
}