
package vilarimvetores1;
import javax.swing.JOptionPane;
public class VilarimVetores1 {

  
    public static void main(String[] args) {
       int num[] = new int [30];
       int quadrado=0, quadradoRES=0;
       for (int i=0;i<5;i++){

           num[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o numero"));   
         
           quadrado = num[i]*num[i];
           quadradoRES = quadradoRES+quadrado;
      JOptionPane.showMessageDialog(null,quadrado);
      
    }JOptionPane.showMessageDialog(null,"o resultado de todos os quadrados é = " +quadradoRES);
    
}
}