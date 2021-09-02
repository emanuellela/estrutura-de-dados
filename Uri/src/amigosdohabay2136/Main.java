package amigosdohabay2136;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main 
{
    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);//caso de teste
        String nome = ""; 
        String nome1;
        String resp = "";
        int maior = 0;
        String amigo = "";
        ArrayList<String>nmyes = new ArrayList<>();
        ArrayList<String>nmno = new ArrayList<>();
        do
        {
            int cont = 0;
            nome = entrada.nextLine();
            if(nome.equalsIgnoreCase("FIM")) //caso não queira ser O Amigo do Habay
            {
                break;
            }
            String info[] = nome.split(" ");
            nome1 = info[0];
            resp = info[1];
            if(resp.equalsIgnoreCase("YES")) //caso o usuario queira ser O Amigo do Habay
            { 
                for(String nY : nmyes)
                {
                    if(nome1.equalsIgnoreCase(nY))
                    {
                        cont++;
                    }
                }
                if(cont == 0)
                {
                   nmyes.add(nome1); 
                }
            }
            else if(resp.equalsIgnoreCase("NO"))
            {
                for(String nN : nmno){
                    if(nome1.equalsIgnoreCase(nN))
                    {
                        cont++;
                    }
                }
                if(cont == 0)
                {
                   nmno.add(nome1); 
                }
            }
        }
        while(!nome.equalsIgnoreCase("FIM"));
        for(String nm : nmyes)
        {
            if(nm.length() > maior)
            {
                maior = nm.length();
                amigo = nm;
            }
        }
        //compara amigo 1 ou 0
        Collections.sort(nmyes);
        for(String nm : nmyes)
        {
            System.out.println(nm);
        }
        Collections.sort(nmno);
        for(String nm : nmno)
        {
            System.out.println(nm);
        }
        System.out.print("\n"); 
        System.out.println("Amigo do Habay:\n"+ amigo); 
    }
}
