package notasdaprova2344;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);	
		int notaGrade = entrada.nextInt();
		char conceitoGrade = ' ';
		if(notaGrade == 0) 
			conceitoGrade = 'E';
		else if(notaGrade>=1 && notaGrade<=35) 
			conceitoGrade = 'D';
		else if(notaGrade>=36 && notaGrade<=60) 
			conceitoGrade = 'C';
		else if(notaGrade>=61 && notaGrade<=85) 
			conceitoGrade = 'B';
		else if(notaGrade>=86 && notaGrade<=100) 
			conceitoGrade = 'A';
		System.out.println(conceitoGrade);
		entrada.close();
	}
}