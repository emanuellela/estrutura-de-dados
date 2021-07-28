package trilhos1062;
//entrada - 5, 1 2 3 4 5, 5 4 1 2 3, 0, 6, 6 5 4 3 2 1, 0, 0
//saida - sim, nao, sim
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main
{
  public static void main(String[] args) throws IOException
  {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 16);
      while (true)
      {
          int N = Integer.parseInt(reader.readLine());
          if(N == 0) break;
          while (true)
          {
              String s = reader.readLine();
              if(s.equals("0")) break;
              String[] ss = s.split("\\s+");
              int[] target = new int[N];
              Stack<Integer> stack = new Stack<>();
              
              for(int i = 0; i < N; i++)
              {
                  target[i] = Integer.parseInt(ss[i]);
              }
              // O pr�ximo n�mero de carro � 1 e o ve�culo de sa�da � 0.
              int proximo = 1, carro = 0;
              boolean vago = true;
              while (carro < N)
              {
                  // Se o pr�ximo alvo e o pr�ximo n�mero de carro forem iguais, o carro � empurrado para a pilha que � estourada
                  if(target[carro] == proximo)
                  {
                      proximo++;
                      carro++;
                  // Se a pilha n�o estiver vazia e o topo da pilha for o pr�ximo destino, a pilha � estourada.
                  }
                  else if(!stack.isEmpty() && target[carro] == stack.peek())
                  {
                      stack.pop();
                      carro++;
                      // Caso contr�rio, ele s� pode ser colocado na pilha
                  }
                  else
                  {
                      // Quando n�o h� carro quando pr�ximo > N, n�o � vi�vel neste momento.
                      if(proximo > N)
                      {
                          vago = false;
                          break;
                      }
                      stack.add(proximo++);
                  }
              }
              System.out.println(vago ? "Yes" : "No");
          }
          System.out.print('\n');
      }
  }
}