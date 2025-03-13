package z_Temperatura.TemperaturaController;

import z_Temperatura.TemperaturaModel.TemperaturaModel;
import z_Temperatura.TemperaturaView.TemperaturaView;

import java.util.Scanner;

public class TemperaturaController {

    private TemperaturaView view;
    private TemperaturaModel model;

    Scanner scanner = new Scanner(System.in);

    public TemperaturaController(TemperaturaView view, TemperaturaModel model) {
        this.view = view;
        this.model = model;
    }

    public void iniciar() {
        int op;
        do {
            op = view.Menu();
            switch (op) {
                case 1:
                    model.adicinarTemperaturas();
                    break;
                case 2:
                    model.temperaturaList();
                    break;
                case 3:
                    System.out.print("Qual data desejo Buscar: ");
                    String dateBuscar = scanner.next();
                    model.buscarTemperaturaData(dateBuscar);
                    break;
                case 4:
                    model.exibirMaiorEMenorTemratura();
                    break;
                case 5:
                    model.mediaTemperatura();
                    break;
                case 6:
                    view.mensagem("Fim do Programa!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 6);
    }
}
