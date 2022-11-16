
package vilarim.repeticao.pkg07;

import javax.swing.JOptionPane;

public class VilarimRepeticao07 {

    public static void main(String[] args) {
        var p ="\n";
        double fah = 0, kel = 0;
        String mostrar="";
        
        
        for (int c=0;c<=100;c++){

            fah = (c*1.8)+32;
            kel = c+273.15;
            
            
            mostrar = mostrar+p+"         "+c+"                  "+fah+"           "+kel;

        JOptionPane.showMessageDialog(null,  "|  Celsius  |   Fahrenheit   |  Kelvin  |"+mostrar);  }      
        
        
        
    }
}
