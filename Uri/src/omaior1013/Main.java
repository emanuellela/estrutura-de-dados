package omaior1013;
import java.io.IOException;
import java.util.Scanner;
public class Main 
{
    public static void main(String[]args) throws IOException
    {
    	Scanner entrada = new Scanner(System.in);
        int a,b,c;
        int MaiorAB;
        int Maior;
        a= entrada.nextInt();
        b= entrada.nextInt();
        c= entrada.nextInt();
        MaiorAB = (a + b + Math.abs(a-b))/2;
        Maior = (MaiorAB + c+ Math.abs(MaiorAB-c))/2;
        System.out.println(Maior+" eh o maior");
    }
}
