package z_Estacionamento.src.EstacionamentoController;


import EstacionamentoView.EstacionamentoView;
import z_Estacionamento.src.EstacionamentoModel.EstacionamentoModel;

import java.util.Scanner;

public class EstacionamentoController {
    private EstacionamentoView view;
    private EstacionamentoModel model;
    Scanner ler = new Scanner(System.in);

    public EstacionamentoController(EstacionamentoView view, EstacionamentoModel model) {
        this.view = view;
        this.model = model;
    }

    public void iniciar() {
        int op;
        do {

            op = view.Menu();
            switch (op) {
                case 1:
                    model.estacionar();
                    view.mensagem("Carro estácionado !!!");
                    break;
                case 2:
                    System.out.print("Qual carro você deseja retirar do estacionamento: ");
                    int indice = ler.nextInt();
                    model.indiceEstacionamento(indice);
                    break;
                case 3:
                    model.listaDeCarrosEstacionados();
                    break;
            }
        } while (op != 4);
    }
}
