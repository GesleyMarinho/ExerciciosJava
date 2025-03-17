package z_Hotel.HotelController;

import z_Hotel.HotelModel.HotelModel;
import z_Hotel.HotelView.HotelView;

import java.util.Scanner;

public class HotelController {
    private HotelView hotelView;
    private HotelModel hotelModel;
    Scanner scanner = new Scanner(System.in);

    public HotelController(HotelView hotelView, HotelModel hotelModel) {
        this.hotelView = hotelView;
        this.hotelModel = hotelModel;
    }

    public void iniciar() {
        int op;
        do {
            op = hotelView.menu();
            scanner.nextLine(); // Evita problema do nextInt() pulando entrada de string

            switch (op) {
                case 1:
                    System.out.print("Nome do hóspede: ");
                    String nome = scanner.nextLine();
                    System.out.print("Número do quarto desejado: ");
                    int quarto = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Data da reserva (yyyy-MM-dd): ");
                    String dataReserva = scanner.nextLine();
                    hotelModel.fazerReservas(nome, quarto, dataReserva);
                    break;
                case 2:
                    hotelModel.listarQuartos();
                    break;
                case 3:
                    System.out.print("Nome do hóspede: ");
                    String nomeHospede = scanner.nextLine();
                    System.out.print("Número do quarto: ");
                    int numeroQuarto = scanner.nextInt();
                    hotelModel.cancelarReserva(nomeHospede, numeroQuarto);
                    break;
                case 4:
                    hotelView.mensagem("Saindo...");
                    break;
                default:
                    hotelView.mensagem("Opção inválida.");
            }
        } while (op != 4);
    }
}
