package preenchimentovetor11173;
import java.io.IOException;
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner entrada = new Scanner(System.in);
        int[] N = new int[10]; 
        N[0] = entrada.nextInt(); //valor lido na primeira posi��o de um vetor N[10]
        for (int i=1; i <10; i++) {
            N[i] = N[i-1] * 2; //para cada posi��o subsequente, o dobro do valor da posi��o anterior
        }
        for (int i=0; i <10; i++) { //para cada posi��o do vetor, escreva "N[i] = X", onde i � a posi��o do vetor e X � o valor armazenado na posi��o i
            System.out.println("N["+ i +"] = " + N[i]);  //O primeiro n�mero do vetor N (N[0]) ir� receber o valor
        }
    }
}
