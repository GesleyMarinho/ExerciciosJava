package z_Hotel.HotelModel;

import java.time.LocalDate;

public class Reserva {
    private Hospede hospede;
    private Quarto quarto;
    private LocalDate dataReserva;

    public Reserva(Hospede hospede, Quarto quarto, LocalDate dataReserva) {
        this.hospede = hospede;
        this.quarto = quarto;
        this.dataReserva = dataReserva;
        this.quarto.ocupar(); // Marca o quarto como ocupado
    }

    public Hospede getHospede() {
        return hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public void cancelarReserva() {
        this.quarto.liberar(); // Libera o quarto quando a reserva é cancelada
    }
}
