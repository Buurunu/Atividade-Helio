
package vilarimvetores2;
import javax.swing.JOptionPane;
public class VilarimVetores2 {

   
    public static void main(String[] args) {
       int num[]= new int[20];

        for (int i=0;i<20;i++){

           num[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a sequencia de numeros"));     
        }

        for (int j=19;j>=0;j--){

            JOptionPane.showMessageDialog(null,num[j]);
            
        }

    }
}
    
    

