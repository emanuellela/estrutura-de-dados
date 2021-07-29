package filasupermercado2065;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
public class Main
{
	public void process() throws NumberFormatException, IOException 
	{
        Scanner entrada = new Scanner(System.in);
        int numFuncionarios = entrada.nextInt();
        int numClientes = entrada.nextInt();
        Queue<Funcionario> queue = new PriorityQueue<>();
        int[] tempFuncionarios = new int[numFuncionarios];
        int[] numItensClientes = new int[numClientes];
        for (int i = 0; i < numFuncionarios; i++) 
        {
            tempFuncionarios[i] = entrada.nextInt();           
        }
        for (int i = 0; i < numFuncionarios; i++)
        {
            queue.add(new Funcionario(i, 0));           
        }
        for (int i = 0; i < numClientes; i++) 
        {
            numItensClientes[i] = entrada.nextInt();           
        }
        for (int i = 0; i < numClientes; i++) 
        {
            Funcionario f = queue.poll();
            int currId = f.id;
            int currTempo = f.tempo;
            int tempoCompra = numItensClientes[i]*tempFuncionarios[currId];
            queue.add(new Funcionario(currId, currTempo+tempoCompra));
        }
        int tempoMax = -1;
        while (queue.size() > 0) 
        {
            Funcionario f = queue.poll();
            tempoMax = Math.max(f.tempo, tempoMax);
        }
        System.out.println(tempoMax);
        return;
    }
    public static void main(String[] args) throws NumberFormatException, IOException 
    {
        Main m = new Main();
        m.process();
        System.exit(0);
    }
}
class Funcionario implements Comparable<Funcionario> 
{
    int id;
    int tempo;
    public Funcionario(int id, int tempo) 
    {
        this.id = id;
        this.tempo = tempo;
    }
    public int compareTo(Funcionario f) 
    {
        if (this.tempo-f.tempo == 0) 
        {
            return this.id-f.id;
        }
        return this.tempo-f.tempo;
    }
}
