package ElevadorController;

import ElevadorModel.ElevadorModel;
import ElevadorView.ElevadorView;

import java.util.Scanner;

public class ElevadorController {
    private ElevadorModel model;
    private ElevadorView view;
    private Scanner scanner = new Scanner(System.in);

    public ElevadorController(ElevadorModel model, ElevadorView view) {
        this.model = model;
        this.view = view;
    }

    public void iniciar() {
        int opcao;
        do {
            opcao = view.exibirMenu();
            switch (opcao) {
                case 1:
                    if (!model.qtPessoas()) {
                        System.out.print("Quantas pessoas vão entrar? ");
                        int pessoas = scanner.nextInt();
                        model.entrarElevador(pessoas);
                        view.exibirMensagem("Agora há " + model.getElevador().getPessoasPresentes() + " pessoas no elevador." + " Capacidade máxima " + model.getElevador().getCapacidadeMaxima());
                    } else {
                        view.exibirMensagem("Elevador cheio!");
                    }
                    break;
                case 2:
                    System.out.print("Quantas pessoas vão sair? ");
                    int pessoasSaindo = scanner.nextInt();
                    model.sairElevador(pessoasSaindo);
                    view.exibirMensagem("Agora há " + model.getElevador().getPessoasPresentes() + " pessoas no elevador." + " Capacidade máxima " + model.getElevador().getCapacidadeMaxima());
                    break;
                case 3:
                    System.out.print("Para qual andar deseja ir? ");
                    int andar = scanner.nextInt();
                    if (model.verificarAndar(andar)) {
                        model.getElevador().setAndarAtual(andar);
                        view.exibirMensagem("Elevador está agora no andar " + andar);
                    } else {
                        view.exibirMensagem("Andar inválido!");
                    }
                    break;
                case 4:
                    System.out.print("Para qual andar deseja descer? ");
                    int andarDescer = scanner.nextInt();
                    if (model.verificarAndar(andarDescer) && andarDescer < model.getElevador().getAndarAtual()) {
                        model.getElevador().setAndarAtual(andarDescer);
                        view.exibirMensagem("Elevador está agora no andar " + andarDescer);
                    } else {
                        view.exibirMensagem("Andar inválido ou superior ao atual!");
                    }
                    break;
                case 5:
                    view.exibirMensagem("Saindo do programa...");
                    break;
                default:
                    view.exibirMensagem("Opção inválida!");
            }
        } while (opcao != 5);
    }
}