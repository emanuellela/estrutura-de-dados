package preenchimentovetor11173;
import java.io.IOException;
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner entrada = new Scanner(System.in);
        int[] N = new int[10]; 
        N[0] = entrada.nextInt(); //valor lido na primeira posição de um vetor N[10]
        for (int i=1; i <10; i++) {
            N[i] = N[i-1] * 2; //para cada posição subsequente, o dobro do valor da posição anterior
        }
        for (int i=0; i <10; i++) { //para cada posição do vetor, escreva "N[i] = X", onde i é a posição do vetor e X é o valor armazenado na posição i
            System.out.println("N["+ i +"] = " + N[i]);  //O primeiro número do vetor N (N[0]) irá receber o valor
        }
    }
}
