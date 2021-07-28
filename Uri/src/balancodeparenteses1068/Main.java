package balancodeparenteses1068;
import java.io.IOException;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner scanner = new Scanner(System.in);	        
		while (scanner.hasNext()) 
		{
			String input = scanner.nextLine();
			int abrirParenteses = 0;
			try 
			{
				for (int i = 0; i < input.length(); i++) 
				{
					char character = input.charAt(i);
		            if(character == ')')
		            {
		            	if(abrirParenteses == 0)
		            	{
		            		throw new Exception();
		            	}
		            	abrirParenteses--;
		            }
		            if(character == '(') 
		            {
		            	abrirParenteses++;
		            }
				}
				if (abrirParenteses > 0) 
				{
					System.out.println("incorrect\n");
		        }
				else 
		        {
					System.out.println("correct\n");
		        }
			} 
			catch(Exception ex) 
			{
				System.out.println("incorrect\n");
			}
		}
	}
}