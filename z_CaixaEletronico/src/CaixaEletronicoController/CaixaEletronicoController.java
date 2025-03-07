package CaixaEletronicoController;

import CaixaEletronicoModel.CaixaEletronicoModel;
import CaixaEletronicoView.CaixaEletronicoView;

public class CaixaEletronicoController {
    private  CaixaEletronicoView view;
    private  CaixaEletronicoModel model;

    public CaixaEletronicoController(CaixaEletronicoModel model, CaixaEletronicoView view){
        this.model = model;
        this.view = view;
    }

    public void iniciar(){
        int opcao;
        do{
            opcao = view.exibirMenu();
            switch (opcao){
                case 1:
                    view.exibirsaldo(model.verificarSaldo());
                    break;
                case 2:
                    double valorDeposito = view.capturarValor();
                    if(model.depositar(valorDeposito)){
                        view.exibirMensagem("Depósito realizado com sucesso!");
                    }else{
                        view.exibirMensagem("Valor inválido para depósito");
                    }
                    break;
                case 3:
                    double valorSaque = view.capturarValor();
                    if(model.sacar(valorSaque)){
                        view.exibirMensagem("Saque realizado com sucesso!");
                    }else{
                        view.exibirMensagem("Saldo insuficiente ou valor inválido");
                    }
                    break;
                case 4:
                    view.exibirMensagem("Obrigado por usar o Caixa eletrônico!");
                    break;
                default:
                    view.exibirMensagem("Opção inválida");
            }
        }while (opcao != 4);
    }
}
