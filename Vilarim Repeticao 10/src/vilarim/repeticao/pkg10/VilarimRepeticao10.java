
package vilarim.repeticao.pkg10;
import javax.swing.JOptionPane;
public class VilarimRepeticao10 {

    
    public static void main(String[] args) {
            int i, num, count; 
		
	JOptionPane.showMessageDialog(null,"numeros primos entre 1 e 1000 são " );
            	
		for(num = 1; num <= 1000; num++)
		{
			count = 0;
		    for (i = 2; i <= num/2; i++)
		    {
		    	if(num % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && num != 1 )
		    JOptionPane.showMessageDialog(null,num+ " " );
                }
    }
}
