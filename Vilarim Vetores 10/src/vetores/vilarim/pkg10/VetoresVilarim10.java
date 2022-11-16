
package vetores.vilarim.pkg10;

import javax.swing.JOptionPane;

public class VetoresVilarim10 {

    public static void main(String[] args) {
       int []num = new int [100];
       String []num2 = new String[100];

        for(int i=0; i<100;i++){
         num[i]= Integer.parseInt(JOptionPane.showInputDialog(null, "insira um numero"));
           if(num[i]%2==0){
               num2[i]="P";
           }
               else{
                if(num[i]%2==1)
                num2[i]="I";
           }JOptionPane.showMessageDialog(null,"O vetor é: " + num2[i]);
        }
        
            
        }
    }
    

