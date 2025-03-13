package z_Estacionamento.src.EstacionamentoModel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EstacionamentoModel {

    private final Estacionamento estacionamento;
    private final List<Estacionamento> estacionamentos;
    private final Scanner scanner;

    public EstacionamentoModel() {
        estacionamento = new Estacionamento("", new Date());
        estacionamentos = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }


    public boolean verificarvagas() {
        return estacionamentos.size() < estacionamento.getQtMaximoVagas();
    }

    public void estacionar() {

        if (verificarvagas()) {

            System.out.print("Qual a placa do Carro: ");
            String placa = scanner.next();
            scanner.nextLine();

            System.out.print("Qual a data de entrada do carro no estacionamento: ");
            String dataEntradaStr = scanner.next() + scanner.nextLine();

            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");

            try {
                Date dataEntrada = format.parse(dataEntradaStr);
                estacionamentos.add(new Estacionamento(placa, dataEntrada));

            } catch (ParseException e) {
                System.out.println("Formato de data inválido! Use dd/MM/yyyy HH:mm.");
            }
        } else {
            System.out.print("Não há Vagas !!!");
        }
    }


    public void listaDeCarrosEstacionados() {
        if (estacionamentos.isEmpty()) {
            System.out.print("Nenhum Carro estácionado");
            return;
        }
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        System.out.println("\n===== Lista de Carros Estacionados =====");
        for (int i = 0; i < estacionamentos.size(); i++) {

            Estacionamento carro = estacionamentos.get(i);
            String dataEntradaFormatada = format.format(carro.getHoraEntrada());

            System.out.printf("🚗 %d) Placa: %s | Entrada: %s%n", i + 1, carro.getPlaca(), dataEntradaFormatada);
        }
        System.out.println("========================================\n");
    }

    public void indiceEstacionamento(int indice) {

        int indiceUsuario = indice - 1;

        if (indiceUsuario >= 0 && indiceUsuario < estacionamentos.size()) {
            Estacionamento carro = estacionamentos.get(indiceUsuario);

            if (pagarEstacionamento(carro.getHoraEntrada())) {
                estacionamentos.remove(indiceUsuario);
                System.out.println("✅ Carro removido do estacionamento.");
            } else {
                System.out.println("O carro não foi removido pois o pagamento não foi efetuado.");
            }
        } else {
            System.out.println("Índice inválido. Nenhum carro removido.");
        }
    }

    public boolean pagarEstacionamento(Date dtEntrada) {
        System.out.print("Qual a data de saída do estacionamento (dd/MM/yyyy HH:mm): ");
        String dtSaidaStr = scanner.next() + scanner.nextLine();

        SimpleDateFormat format = new SimpleDateFormat();

        try {
            Date dtSaida = format.parse(dtSaidaStr);

            if (dtSaida.before(dtEntrada)) {
                System.out.println("Erro: A data de saída não pode ser anterior à entrada.");
                return false;
            }

            long diffMillis = dtSaida.getTime() - dtEntrada.getTime();
            double horas = (double) diffMillis / (1000 * 60 * 60); // Converter milissegundos para horas

            // Definir preço baseado no tempo
            double preco = (horas <= 1) ? 5.0 : 6.0;
            System.out.printf("Tempo de permanência: %.2f horas | Valor a pagar: R$ %.2f%n", horas, preco);

            // Simulação de pagamento
            System.out.print("Confirme o pagamento (digite 'S' para pagar): ");
            String confirmacao = scanner.next().toUpperCase();

            if (confirmacao.equals("S")) {
                System.out.println("Pagamento realizado com sucesso!");
                return true;
            } else {
                System.out.println("pagamento não realizado voltando ao Menu");
                return false;
            }

        } catch (ParseException e) {
            System.out.println("Erro: Formato de data inválido! Use dd/MM/yyyy HH:mm.");
            return false;
        }
    }
}