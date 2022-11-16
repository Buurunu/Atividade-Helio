
package vilarimvetores4;

import javax.swing.JOptionPane;

public class VilarimVetores4 {

      public static void main(String[] args) {
       int num[]= new int[20];

        for (int i=0;i<20;i++){

           num[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a sequencia de numeros"));     
        }

        for (int j=0;j<20;j++){
        if (num[j]%2!=0){
            JOptionPane.showMessageDialog(null,num[j]);
        }
        }
    }
}