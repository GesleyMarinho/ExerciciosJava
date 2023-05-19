package calculoNumerosPares;

public class NumerosPares {

    int numeroPar;

    public NumerosPares() {

    }

    public int getNumeroPar() {
        return numeroPar;
    }

    public void setNumeroPar(int numeroPar) {
        this.numeroPar = numeroPar;
    }

    public int calcularNumerosPares(int par) {
        // leia um número inteiro positivo n e calcule a soma dos n primeiros números pares.
        int soma = 0;
        for (int i = 0; i <= par; i++) {
            if (i % 2 == 0) {
                soma = soma + i;

            }
        }
        return soma;
    }
}
