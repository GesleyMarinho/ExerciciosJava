package LogicaProgramacao.beecrowd.ex08;

/*
* Quase to-do estudante de Ciência da Computação recebe em algum momento no início de seu curso de graduação algum problema envolvendo a sequência de Fibonacci.
*  Tal sequência tem como os dois primeiros valores 0 (zero) e 1 (um) e cada próximo valor será sempre a soma dos dois valores imediatamente anteriores.
*  Por definição, podemos apresentar a seguinte fórmula para encontrar qualquer número da sequência de Fibonacci:
fib(0) = 0
fib(1) = 1
fib(n) = fib(n-1) + fib(n-2);

Uma das formas de encontrar o número de Fibonacci é através de chamadas recursivas.
* Isto é ilustrado a seguir, apresentando a árvore de derivação ao calcularmos o valor fib(4), ou seja o 5º valor desta sequência:

Desta forma,
fib(4) = 1+0+1+1+0 = 3
Foram feitas 8 calls, ou seja, 8 chamadas recursivas.
Entrada
A primeira linha da entrada contém um único inteiro N, indicando o número de casos de teste. Cada caso de teste contém um inteiro X (1 ≤ X ≤ 39) .

Saída
Para cada caso de teste de entrada deverá ser apresentada uma linha de saída, no seguinte formato: fib(n) = num_calls calls = result, aonde num_calls é o número de chamadas recursivas, tendo sempre um espaço antes e depois do sinal de igualdade, conforme o exemplo abaixo.

Exemplo de Entrada
2
5
4

* Exemplo de Saída
fib(5) = 14 calls = 5
fib(4) = 8 calls = 3
* */

import java.util.Scanner;

public class Main {
    static int count; // Variável para contar o número de chamadas recursivas

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int x = ler.nextInt(); // Número de casos de teste

        for (int i = 0; i < x; i++) {
            int n = ler.nextInt(); // Valor de Fibonacci a ser calculado para este caso
            count = 0; // Reinicia o contador de chamadas para cada caso
            int resultado = Fibo(n); // Calcula o Fibonacci de n

            System.out.printf("fib(%d) = %d calls = %d\n", n, count - 1, resultado);
        }
    }

    public static int Fibo(int fib) {
        count++; // Conta a chamada recursiva
        if (fib == 0) return 0;
        if (fib == 1) return 1;

        return Fibo(fib - 1) + Fibo(fib - 2); // Corrige a chamada para `Fibo`
    }
}
