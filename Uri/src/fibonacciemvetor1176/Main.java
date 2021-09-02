package fibonacciemvetor1176;
import java.io.IOException;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner entrada= new Scanner(System.in);
		int T; //número de casos de teste
		int N; 
		long Fib[] = new long [61];
		for(int i =2;i<61;i++)
		{
			Fib[i] = i;
		}
		Fib[0]=0;
		Fib[1]=1;
		Fib[2]=1;
		Fib[3]=2;
		Fib[4]=3;
		for(int i =6;i<61;i++)
		{
		    Fib[i] = Fib[i - 1] + Fib[i-2];
		}
		T = entrada.nextInt();
		for(int i = 0; i<T; i++)
		{
			N = entrada.nextInt();
			System.out.println("Fib("+N+")"+" = "+ Fib[N]);
        }
    }
}
