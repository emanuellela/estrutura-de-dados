package media31040;
import java.io.IOException;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)throws IOException 
    {
        Scanner entrada = new Scanner(System.in);
        float n1,n2,n3,n4, media,nota;
        String mf;
        n1 = entrada.nextFloat();
        n2 = entrada.nextFloat();
        n3 = entrada.nextFloat();
        n4 = entrada.nextFloat();
        media = ((2*n1) + (3*n2) + (4*n3) + n4)/10;        
        mf = String.format("%.1f", media);
        System.out.println("Media: " + mf);
        if(media >= 7.0f)
        {
            System.out.println("Aluno aprovado.");
        }
        else if (media < 5.0f)
        {
            System.out.println("Aluno reprovado.");
        }
        else if(media >= 5.0f && media <= 6.9f)
        {
            System.out.println("Aluno em exame.");
            nota = entrada.nextFloat();
            System.out.println("Nota do exame: " + String.format("%.1f", nota));
            float notamedia = (nota + media)/2;
            String mediafinal = String.format("%.1f", notamedia);
            if(notamedia >= 5.0f)
            {
                System.out.println("Aluno aprovado.");
            }
            else if(notamedia < 5.0f)
            {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + mediafinal);
        }
    }
}