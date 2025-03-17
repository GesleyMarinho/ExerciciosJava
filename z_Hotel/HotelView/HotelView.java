package z_Hotel.HotelView;

import java.util.Scanner;

public class HotelView {

    Scanner scanner = new Scanner(System.in);

    public int Menu() {
        int op;
        System.out.println("Sistema de reserva de Quartos");
        System.out.println("1- Reservar um quarto");
        System.out.println("2- Listar quartos disponiveis");
        System.out.println("3- Cancelar a reserva");
        System.out.print("Qual a oppção Desejada: ");
        op = scanner.nextInt();
        return op;
    }

    public void mensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
