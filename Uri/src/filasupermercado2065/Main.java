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
        int numFuncionarios = entrada.nextInt();//numero de funcionários no caixa 
        int numClientes = entrada.nextInt(); //numero de clientes
        Queue<Funcionario> queue = new PriorityQueue<>();
        int[] tempFuncionarios = new int[numFuncionarios];
        int[] numItensClientes = new int[numClientes];
        for (int i = 0; i < numFuncionarios; i++) 
        {
            tempFuncionarios[i] = entrada.nextInt();//quanto tempo leva para o i-esimo funcionario processar um item
        }
        for (int i = 0; i < numFuncionarios; i++)
        {
            queue.add(new Funcionario(i, 0));           
        }
        for (int j = 0; j < numClientes; j++) 
        {
            numItensClientes[j] = entrada.nextInt();//quantos itens o j-esimo cliente tem em sua cesta         
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
        return this.tempo-f.tempo; //quanto tempo leva para que todos os clientes sejam atendidos
    }
}
