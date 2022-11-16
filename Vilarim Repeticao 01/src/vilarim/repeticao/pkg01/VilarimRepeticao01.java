
package vilarim.repeticao.pkg01;

import javax.swing.JOptionPane;
import java.util.List;
import java.util.stream.Collectors;
public class VilarimRepeticao01 {

    
    public static void main(String[] args) {
        // TODO code application logic here

        // frase de entrada
        String mostrar = "";
        int vog = 0, con = 0;
        char cont, c;
        String ref = "aeiouAEIOU";
        String entrada = "QUESTAO ! !";     
        // contando o tamanho da frase de entrada 1-
        int caracter1 = entrada.length();
        JOptionPane.showMessageDialog(null, " = " + entrada + "\nnessa frase contém " + caracter1 + " caracteres");
        // contando a quantidade sem contar espaços da frase de entrada 1-
        int caracter2 = entrada.replace(" ", "").length();
        JOptionPane.showMessageDialog(null, "E contém " + caracter2 + " sem contar os espaços.");

        int totalCaracter = 0;
        char letra;
        for (int i = 0; i < entrada.length(); i++) {

            letra = entrada.charAt(i);
            if (letra == 'a' || letra == 'z'|| letra == 'A'|| letra == 'Z')
                totalCaracter++;
        }
        JOptionPane.showMessageDialog(null,
                "Na frase ( " + entrada + " ) as letras (A) e (Z) aparecem " + totalCaracter + " vezes");

        // verificação de concoenates e vogais

        for (int i = 0; i < entrada.length(); i++) {

            if ((entrada.charAt(i) >= 'A'
                    && entrada.charAt(i) <= 'Z')
                    || (entrada.charAt(i) >= 'a'
                            && entrada.charAt(i) <= 'z')) {
                if (ref.indexOf(entrada.charAt(i)) != -1)
                    vog++;
                else
                    con++;
            }
        }
        JOptionPane.showMessageDialog(null, "vogais = " + vog + "\nconsoantes= " + con);

        // Letras especiais
        for (int i = 0; i < entrada.length(); i++) {

            cont = entrada.charAt(i);
            if (cont == '#')
                totalCaracter++;

        }

        String stringValue = entrada;
        List<Integer> listOfIntegers = stringValue.chars()
                .boxed()
                .collect(Collectors.toList());

        for (int i : listOfIntegers) {

            JOptionPane.showMessageDialog(null, "valor de cada letra respectivamente" + "  " + i);
        }

    }
}
