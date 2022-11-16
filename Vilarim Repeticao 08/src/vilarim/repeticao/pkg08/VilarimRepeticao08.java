
package vilarim.repeticao.pkg08;

import javax.swing.JOptionPane;

public class VilarimRepeticao08 {

    public static double fatorial (double num){

        double numero=num;
        double contador=num;
        double numeral=num;
        
        while(contador>1){
            numeral=numeral-1;
            numero *=numeral;
            contador--;
        }
        return(double) numero;
    }
   
    public static void main(String[] args) {
        
        double numero;
        String snumero;
        double numsei=1;
        double contador=1;

        snumero=JOptionPane.showInputDialog(null,"Digite um número: ");
        numero=Double.parseDouble(snumero);
       
        while(contador<numero){
            
           numsei +=1/fatorial(contador);
            contador++;
        }
        JOptionPane.showMessageDialog(null,numsei);  
    }
      
    }

