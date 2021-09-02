package filadorecreio1548;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());	
		while(testCases > 0) 
		{
			testCases --;
			int numAlunos = Integer.parseInt(br.readLine());
			String[] gradeList = br.readLine().split("\\s+");
			List<Integer> gradeListInt = new ArrayList<>();
			for(int i = 0; i < gradeList.length; i++)
				gradeListInt.add(Integer.parseInt(gradeList[i]));
			Collections.sort(gradeListInt);
			Collections.reverse(gradeListInt);
			int resultado = 0;
			for(int i = 0; i < gradeList.length; i++)
				if (Integer.parseInt(gradeList[i]) == gradeListInt.get(i))
					resultado++;
			System.out.println(resultado);
		}
	}
}