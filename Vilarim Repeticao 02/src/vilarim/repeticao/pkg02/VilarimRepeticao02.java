
package vilarim.repeticao.pkg02;

import javax.swing.JOptionPane;

public class VilarimRepeticao02 {

     public static void main(String[] args) {
    
        double sal,medsal=0,por_2=0,medpor=0,totsal=0,csal=0;
        double maior=0,medfil=0,fil=0,totfil=0,cfil=0;
        
        do{
           
           sal= Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salário: "));
           
           
           if(sal >=0){
               fil= Double.parseDouble(JOptionPane.showInputDialog("Quantos filhos você tem: "));
               csal++;
               totsal += sal;
               cfil++;
               totfil+=fil;
           
               medfil = totfil/cfil;
               medsal = totsal/csal;
           }
          
           if (sal > maior){
               maior = sal;
           }
           if((sal >= 0 )&&(sal <= 200)){
               por_2++;
           }
           medpor =(por_2/csal)*100;
        }while(sal >= 0);{
        JOptionPane.showMessageDialog(null, "A média salarial foi: "+medsal);
        JOptionPane.showMessageDialog(null, "A média de fillhos foi: "+medfil);
        JOptionPane.showMessageDialog(null, "O maior salario foi: "+maior);
        JOptionPane.showMessageDialog(null, "O percentual salarial até 200,00 R$ foi: "+medpor+"%");
    }
    }
}
