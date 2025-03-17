package z_Hotel.HotelModel;


import z_Hotel.HotelView.HotelView;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class HotelModel {
    private List<Quarto> quartos;
    private List<Reserva> reservas;
    private HotelView hotelView;
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public HotelModel(HotelView hotelView) {
        this.hotelView = hotelView;
        this.quartos = new ArrayList<>();
        this.reservas = new ArrayList<>();

        // Criando 10 quartos com capacidade aleatória entre 1 e 4 pessoas
        for (int i = 1; i <= 10; i++) {
            quartos.add(new Quarto(i, (int) (Math.random() * 4) + 1));
        }
    }
    public void listarQuartos() {
        hotelView.mensagem("Quartos Disponíveis:");
        for (Quarto quarto : quartos) {
            if (quarto.isDisponivel()) {
                hotelView.mensagem("Quarto " + quarto.getNumero() + " (Capacidade: " + quarto.getCapacidade() + ")");
            }
        }
    }

    public void fazerReservas(String nome, int numeroQuarto, String dataReserva) {
        Quarto quartoEscolhido = buscarQuarto(numeroQuarto);

        if (quartoEscolhido == null || !quartoEscolhido.isDisponivel()) {
            hotelView.mensagem("O quarto " + numeroQuarto + " não está disponível.");
            return;
        }

        try {

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate data = LocalDate.parse(dataReserva, formatter);



            Hospede hospede = new Hospede(nome);
            Reserva novaReserva = new Reserva(hospede, quartoEscolhido, data);
            reservas.add(novaReserva);

            hotelView.mensagem("Reserva feita para " + nome + " no quarto " + numeroQuarto + " para " + data);
        }catch (DateTimeParseException e){
            hotelView.mensagem("Erro: Formato inválido na data. Use dd/MM/yyyy");
        }
    }

    public boolean cancelarReserva(String nome, int numeroQuarto) {
        for (Reserva reserva : reservas) {
            if (reserva.getHospede().getNome().equalsIgnoreCase(nome) && reserva.getQuarto().getNumero() == numeroQuarto) {
                reserva.cancelarReserva();
                reservas.remove(reserva);
                hotelView.mensagem("Reserva cancelada com sucesso.");
                return true;
            }
        }
        hotelView.mensagem("Reserva não encontrada.");
        return false;
    }

    private Quarto buscarQuarto(int numero) {
        return quartos.stream().filter(q -> q.getNumero() == numero).findFirst().orElse(null);
    }
}
