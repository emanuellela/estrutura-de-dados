package menoreposicao1180;
import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException
	{
		Scanner entrada = new Scanner(System.in);
		int N,valor,mv,posicao = 0; //mv = menor valor
		N = entrada.nextInt();
		int vetor[] = new int[N];
		for (int i = 0; i < N; i++) 
		{
			valor = entrada.nextInt();
	        	vetor[i] = valor;
		}
		mv = vetor[0];
		for (int X = 1; X < N; X++) 
		{
			if (vetor[X] < mv) 
			{
				mv = vetor[X];
				posicao = X;
			}
	    	}
	    	System.out.println("Menor valor: "+ mv +"\n"+ "Posicao: "+ posicao);
	}
}
