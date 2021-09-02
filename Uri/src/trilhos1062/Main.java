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
              //proximo numero do bloco eh 1 e o de saida eh 0
              int proximo = 1, bloco = 0;
              boolean vago = true;
              while (bloco < N)
              {
                  //se o proximo alvo e o proximo numero do bloco forem iguais, o bloco eh empurrado para a pilha que eh estourada
                  if(target[bloco] == proximo)
                  {
                      proximo++;
                      bloco++;
                  //se a pilha nao estiver vazia e o topo da pilha for o proximo destino, a pilha eh estourada
                  }
                  else if(!stack.isEmpty() && target[bloco] == stack.peek())
                  {
                      stack.pop();
                      bloco++;   
                  }
                  else //caso contrario, ele nao pode ser colocado na pilha
                  {
                      //quando nao ha blocos, 'proximo > N' eh falso
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
