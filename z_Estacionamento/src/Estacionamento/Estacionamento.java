package Estacionamento;

import java.util.Date;

public class Estacionamento {

    private String placa;
    private Date horaEntrada;
    private Date horaSaida;
    private int qtMaximoVagas;


    public Estacionamento(String placa, Date horaEntrada) {
        this.placa = placa;
        this.horaEntrada = horaEntrada;
        this.qtMaximoVagas = 5;

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getQtMaximoVagas() {
        return qtMaximoVagas;
    }

    public void setQtMaximoVagas(int qtMaximoVagas) {
        this.qtMaximoVagas = qtMaximoVagas;
    }

    public Date getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Date horaSaida) {
        this.horaSaida = horaSaida;
    }
}
