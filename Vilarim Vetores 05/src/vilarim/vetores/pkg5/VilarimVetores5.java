
package vilarim.vetores.pkg5;

import javax.swing.JOptionPane;

public class VilarimVetores5 {

    public static void main(String[] args) {
      double [] vetor = new double [50];
        
         for (int i=0;i<vetor.length;i++){
            vetor[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor: "));
      }
        for (int i=0;i<2;i++){
            if (vetor[i]%2==1){
                vetor[i] = vetor[i]*1.05;
               JOptionPane.showMessageDialog(null,"Os numeros ímpares são: "+vetor[i]); 
            }
            else {
                vetor [i] = vetor [i]*1.02;
                JOptionPane.showMessageDialog(null,"Os numeros pares são: "+ vetor[i]);
            }
        }
    }
}
