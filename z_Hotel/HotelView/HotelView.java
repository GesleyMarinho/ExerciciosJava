package z_Hotel.HotelView;

import java.util.Scanner;

public class HotelView {
    Scanner scanner = new Scanner(System.in);

    public int menu() {
        System.out.println("Sistema de reserva de Quartos");
        System.out.println("1 - Reservar um quarto");
        System.out.println("2 - Listar quartos disponíveis");
        System.out.println("3 - Cancelar a reserva");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public void mensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
