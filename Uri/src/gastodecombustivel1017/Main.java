package gastodecombustivel1017;
import java.io.IOException;
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner entrada = new Scanner(System.in);
        float gv, vm; //gasto da viagem(em horas) e velocidade média(em km/h)
        float r;
        gv = entrada.nextInt();
        vm = entrada.nextInt();
        r = gv*vm/12;
        System.out.printf("%.3f\n", r);
    }
}
