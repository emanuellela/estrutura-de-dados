package fila2460;
import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{

	public static void main (String args[])
	{
	    Scanner entrada = new Scanner(System.in);  
	    int qFila,saiu,sF = 0;
	    String pessoas;
	    String qmSaiu;
	    //Quantas pessoas estão na fila
	    qFila = entrada.nextInt();
	    entrada.nextLine();
	    String people[] = new String[qFila];
	    ArrayList<Integer> fila = new ArrayList<>();
	    ArrayList<Integer> saiuFila = new ArrayList<>();
	    //número das pessoas
	    pessoas = entrada.nextLine();
	    people = pessoas.split(" ");
	    for(int i = 0; i<qFila; i++)
	    {
	        fila.add(Integer.parseInt(people[i]));
	    }
	    //quantos sairam
	    saiu = entrada.nextInt();
	    entrada.nextLine();
	    String saiuP[] = new String[saiu];
	    //números que sairam
	    qmSaiu = entrada.nextLine();
	    saiuP = qmSaiu.split(" ");
	    for(int i = 0; i<saiu; i++)
	    {
	        saiuFila.add(Integer.parseInt(saiuP[i]));
	    }
	    for(Integer s : saiuFila)
	    {
	        fila.remove(s);
	    }
	    
	    for(int c = 0; c<fila.size(); c++)
	    {
	        System.out.print(fila.get(c));
	        int i = c;
	        i++;
	        if(i == fila.size())
	        {
	            System.out.println();
	        }
	        else
	        {
	            System.out.print(" ");
	        }
	    }
	}
}
