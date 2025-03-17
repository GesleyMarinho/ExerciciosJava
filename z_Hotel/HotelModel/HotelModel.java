package z_Hotel.HotelModel;


import z_Hotel.HotelView.HotelView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class HotelModel {
    private List<String> nomeHospedes;
    private List<Date> dataReservas;
    private static final int total_Quartos = 10;
    private List<Boolean> quartosDisponiveis;

    private HotelView hotelView;
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public HotelModel(HotelView hotelView) {
        this.hotelView = hotelView;
        this.quartosDisponiveis = new ArrayList<>();
        this.nomeHospedes = new ArrayList<>();
        this.dataReservas = new ArrayList<>();

        for (int i = 1; i <= total_Quartos; i++) {
            quartosDisponiveis.add(true);
            nomeHospedes.add(null);
            dataReservas.add(null);
        }
    }

    public void listarQuartos() {
        hotelView.mensagem("Quartos Disponiveis");
        for (int i = 0; i < total_Quartos; i++) {
            if (quartosDisponiveis.get(i)) {
                hotelView.mensagem(" O Quarto " + (i + 1) + " está disponivel");
            } else {
                hotelView.mensagem(" O Quarto " + (i + 1) + " está indisponivel");
            }
        }
    }

    public void fazerReservas(String nome, int numeroQuarto, String dataReserva) {

        try {

            Date dataFormatada = format.parse(dataReserva);

            if (numeroQuarto < 1 || numeroQuarto > total_Quartos) {
                hotelView.mensagem("Número do quarto inválido.");
                return;
            }

            // Adicionando a verificação para evitar duplicação
            if (temReserva(numeroQuarto)) {
                hotelView.mensagem("O quarto " + numeroQuarto + " já está ocupado.");
                return;
            }

            quartosDisponiveis.set(numeroQuarto - 1, false);
            nomeHospedes.set(numeroQuarto - 1, nome);
            dataReservas.set(numeroQuarto - 1, dataFormatada);

            hotelView.mensagem("Reserva feita para " + nome + " no quarto " + numeroQuarto + " data da reserva " + dataFormatada);

        } catch (Exception e) {
            hotelView.mensagem("Erro ao fazer a reserva: " + e.getMessage());
        }
    }


    public boolean cancelarReserva(String nome, int nQuarto) {

        if (temReserva(nQuarto) && (nQuarto < 1 || nQuarto > total_Quartos)) {
            hotelView.mensagem("Nenhuma reserva encontrado par ao quarto " + nQuarto + ".");
            return false;
        }
        int index = nQuarto - 1;

        temReserva(nQuarto);

        if (!quartosDisponiveis.get(index) && nomeHospedes.get(index) != null && nomeHospedes.get(index).equalsIgnoreCase(nome)) {

            quartosDisponiveis.set(index, true);
            dataReservas.set(index, null);
            nomeHospedes.set(index, null);
            hotelView.mensagem("Reserva do quarto " + nQuarto + " para " + nome + " foi cancelada.");
            return true;
        } else {
            hotelView.mensagem("Reserva não encontrada ou nome incorreto.");
            return false;
        }
    }

    public boolean temReserva(int nQuarto) {
        if (nQuarto < 1 || nQuarto > total_Quartos) {
            hotelView.mensagem("Número do Quarto inválido");
            return false;
        }

        int index = nQuarto - 1;

        if (index >= quartosDisponiveis.size() || index >= nomeHospedes.size()) {
            hotelView.mensagem("Erro: indice fora do alcance da lista");
            return false;
        }

        return !quartosDisponiveis.get(index) && nomeHospedes.get(index) != null;
    }
}
