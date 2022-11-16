
package vilarim.repeticao.pkg09;

import javax.swing.JOptionPane;

public class VilarimRepeticao09 {

    
    public static void main(String[] args) {
        int contador, milho = 1;
        
        
        for (contador=1;contador<=30;contador++){
            milho = milho*2;
    
        JOptionPane.showMessageDialog(null, "Quantidade de Quadrados=" +contador+ "\n" + "Quantidade de Milhos=" +milho);}
        JOptionPane.showMessageDialog(null, "Programa não suporta acima de 30 Quadrados");
    }
    
}