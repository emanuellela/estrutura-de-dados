package intervalo1037;
import java.io.IOException;
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner entrada = new Scanner(System.in);
        float valor;
        valor = entrada.nextFloat();

        if (valor > 25 && valor <= 50)
        {
        	System.out.println("Intervalo " + "(25,50]");
        }
        else if(valor >= 0 && valor <= 25) 
        {
        	System.out.println("Intervalo " + "[0,25]");
        }
        else if(valor >= 75 && valor <= 100)
        {
        	System.out.println("Intervalo " + "(75,100]");
        }
        else 
        {
        	System.out.println("Fora de intervalo");
        }
    }
}
