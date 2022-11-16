
package vetores.vilarim.pkg8;

import javax.swing.JOptionPane;

public class VetoresVilarim8 {

    public static void main(String[] args) {
       double[] vetor1 = new double [30];
        double[] vetor2 = new double [30];
        double[] vetor3 = new double [30];
        
        for (int i=0;i<30;i++){
            vetor1[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um número: "));
            vetor2[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um outro número: "));
            
            if (vetor1[i]==vetor2[i]){
                vetor3[i]=1;   
            }
            else{  
                vetor3[i]=0; 
            }
            JOptionPane.showMessageDialog(null,"Valor = " + vetor3[i]);
        }
        
            
        }
    }
    

