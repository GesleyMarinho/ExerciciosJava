package CaixaEletronicoModel;

public class CaixaEletronicoModel {
    private double saldo;

    public CaixaEletronicoModel(){
        this.saldo = 0.0;
    }

    public double verificarSaldo(){
        return saldo;
    }

    public boolean depositar (double valor){
        if(valor>0){
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor){
        if(valor > 0){
            saldo -= valor;
            return true;
        }
        return false;
    }

}
