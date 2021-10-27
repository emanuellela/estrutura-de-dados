package media21006;
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args)
    {
    	Scanner entrada = new Scanner(System.in);
		double n1 = entrada.nextDouble();
		double n2 = entrada.nextDouble();
		double n3 = entrada.nextDouble();
		double MEDIA;
		MEDIA = (n1*2 + n2*3 + n3*5)/10;
		System.out.printf("MEDIA = %.1f\n",MEDIA);
    }
   
} 