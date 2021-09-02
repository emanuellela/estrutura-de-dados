package pareseimpares1259;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		List<Integer> N = new ArrayList<>();
		List<Integer> pares	= new ArrayList<>();
		List<Integer> impares = new ArrayList<>();
		int numberInputs = scan.nextInt();
		for (int i = 0 ; i < numberInputs ; i++)
            N.add(scan.nextInt());
		for (int numero: N)
		{
			if (numero % 2 == 0) 
			{
				pares.add(numero);
                continue;
            }
            impares.add(numero);
		}
        Collections.sort(impares);
		Collections.reverse(impares);
		Collections.sort(pares);
		for (Integer numPar: pares)
			System.out.println(numPar);
        for (Integer numImpar: impares)
			System.out.println(numImpar);
		scan.close();
	}
}
