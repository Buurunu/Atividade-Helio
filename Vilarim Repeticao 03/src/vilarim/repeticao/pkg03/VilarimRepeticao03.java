
package vilarim.repeticao.pkg03;

import javax.swing.JOptionPane;


public class VilarimRepeticao03 {

    public static void main(String[] args) {
     int n1=0,n2=0,n3=0,n4=0,n=0;
     
     
     
     for (int i=1;i>0;i++) {
        
         if(n>=0){ 
            n = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de acertos do "+i+"° candidato (-1 para parar a contagem)" ));}

      if ((n>=0)&&(n<=25)){
          n1 = n1 + 1;          
      }
      else if ((n>= 26) && (n <= 50)) {
          n2 = n2 + 1;   
                  
      }
      else if ((n >= 51) && (n <= 75)) {
         n3 = n3 + 1;   
      }
      else if ((n>= 76) && (n <= 100)) {
          n4 = n4 + 1;
    }
    }
     while(n>=0);{
        JOptionPane.showMessageDialog(null,"Quantidade de números no intervalo de 0 a 25, é de " + n1);
        JOptionPane.showMessageDialog(null,"Quantidade de números no intervalo de 26 a 50, é de " + n2);
        JOptionPane.showMessageDialog(null,"Quantidade de números no intervalo de 51 a 75, é de " + n3);
        JOptionPane.showMessageDialog(null,"Quantidade de números no intervalo de 76 a 100, é de " + n4);
        
    }
    }
}

    
    

