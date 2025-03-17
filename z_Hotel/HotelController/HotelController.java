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
            op = hotelView.Menu();
            switch (op) {
                case 1:

                        System.out.println("Qual o nome do hospede: ");
                        String nome = scanner.nextLine();
                        System.out.println("Qual o quarto vc deseja: ");
                        int quarto = scanner.nextInt();
                        System.out.println("Qual a data da reserva ");
                        String dataReserva = scanner.nextLine();

                        hotelModel.fazerReservas(nome, quarto, dataReserva);
                    break;
                case 2:
                         hotelModel.listarQuartos();
                    break;
                case 3:
                        System.out.println("Digite o nome do hóspede:");
                        String nomeHospede = scanner.nextLine();
                        System.out.println("Digite o número do quarto:");
                        int numeroQuarto = scanner.nextInt();
                        scanner.nextLine(); // Consumir quebra de linha*/

                        if (hotelModel.cancelarReserva(nomeHospede, numeroQuarto)) {
                            hotelView.mensagem("Cancelamento realizado com sucesso.");
                        } else {
                            hotelView.mensagem("Erro ao cancelar reserva.");
                        }
                    break;
                default:
                        hotelView.mensagem("Nenhum Opção válida");
            }
        } while (op != 4);
    }
}
