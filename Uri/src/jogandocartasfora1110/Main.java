package jogandocartasfora1110;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
public class Main 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] respostas = new String[50];
		for (int i = 0; i < 50; i++) 
		{
			StringBuilder sb = new StringBuilder();
			int qntCartas = i+1;
			ArrayList<Integer> pilha = new ArrayList<Integer>();
			insere(qntCartas, pilha);
			sb.append("Discarded cards: ");    
			int topo = 0;
			while (qntCartas > 1) 
			{
				if (topo > 0) 
				{
					sb.append(", ");
				}
				sb.append(String.valueOf(pilha.get(topo)));
				topo++; // simula uma remoção da pilha
				qntCartas--; // por remover uma carta
				realoca(topo, pilha); // coloca a carta no topo na base
				topo++; // considera a proxima carta
			}
            		sb.append("\nRemaining card: " + pilha.get(topo) + "\n");
            		respostas[i] = sb.toString();
		}
		int qntCartas = leitor(br);
		while (qntCartas != 0) 
		{
    			bw.write(respostas[qntCartas-1]);
      			qntCartas = leitor(br);
		}
		bw.flush();       
		bw.close();
	}
	static void insere(int qte, ArrayList<Integer> pilha) 
	{
		for (int i = 0; i < qte; i++) 
		{
		    pilha.add(i+1);
		}
	}
	static void realoca(int topo, ArrayList<Integer> pilha) 
	{
		int carta = pilha.get(topo);      
		pilha.add(carta);
	} 
   	static int leitor(BufferedReader br) throws NumberFormatException, IOException 
	{
	       int n;
	       int resp = 0;
	       int carta = 1;
	       while (true)
	       {
		   n = br.read();
		   if (n >= '0' && n <= '9') break;
		   if (n == '-') carta = -1;
		   if (n == '+') carta = 1;
	       }
	       while (true) 
	       {
		   resp = resp*10 + n-'0';
		   n = br.read();
		   if (n < '0' || n > '9') break;
	       }
	       return resp*carta;
	}
}

