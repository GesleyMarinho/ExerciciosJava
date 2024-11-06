package LogicaProgramacao.beecrowd.ex06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
*A tarefa é simples. Através de alguns pontos críticos em 2D, você deve desenhar uma onda como uma curva.
* Seu objetivo é incluir tantos pontos quantos forem possível.

Haverá uma linha imaginária y = a, a qual chamaremos de eixo principal para a curva.
Todos os pontos na curva deverão ter diferentes coordenadas x. Suas coordenadas y devem ser na forma a-1 ou a+1.
Dois pontos consecutivos na curva devem ter diferença de 2 na coordenada y.

Entrada
Haverá no máximo, 222 casos de testes. Cada caso inicia com um inteiro N, que é o número de pontos no caso de teste.
* Nas próximas N linhas, haverá N pares de inteiros dando as coordenadas x e y de cada ponto.
* Não haverá mais do que 1000 pontos em cada caso de teste.
* Todas coordenadas são inteiros – eles devem ficar dentro de um inteiro de 2 bytes com sinal.
* Os dados devem ser lidos da entrada padrão.

Saída
Para cada caso de teste, imprima um número – o número máximo de pontos críticos
*que podem ser incluídos em uma curva desenhada a partir dos pontos dados.
*
* */
public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        int casos = 0;

        while (ler.hasNext()) {
            int n = ler.nextInt(); //numero de casos

         List<Point> pontos = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int x = ler.nextInt();
                int y = ler.nextInt();
                pontos.add(new Point(x,y));
            }

            Collections.sort(pontos);

            int maxPontosNaCurva = 1;
            int ultimoY = pontos.get(0).y;

            for(int i=1;i<n;i++){
                int yAtual = pontos.get(i).y;

                if(Math.abs(yAtual- ultimoY) == 2){
                    maxPontosNaCurva++;
                    ultimoY = yAtual;
                }
            }

            System.out.println(maxPontosNaCurva);
        }
    }

    static class Point implements Comparable<Point>{

        int x,y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            return Integer.compare(this.x, o.x);
        }
    }


}
