package VOO;

import java.util.Scanner;

public class MainVoo {
    public static void main(String[] args) {

        Scanner ler = new Scanner((System.in));

         int a;


        Voo voo = new Voo(1);

        System.out.printf("Em qual lugar deseja sentar : ");
        a = ler.nextInt();
        voo.ocupa(a);
        System.out.println("Proximo Assento livre é : " + voo.proximoLivre());
        System.out.println("Números de vagas disponivéis :  " + voo.vagas());
        System.out.println("Número do Voo é "+ voo.getVoo());
        System.out.print("Qual o Assento deseja verificar : ");
        a = ler.nextInt();
        System.out.println("o Assento está ? "+ voo.verifica(a));




    }
}
