package z_Temperatura.Temperatura;

import java.util.Date;

public class Temperatura {

    private double temperaturaMax;
    private double temperaturaMin;
    private Date dataDia;

    public Temperatura(double temperaturaMax, double temperaturaMin, Date dataDia) {
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
        this.dataDia = dataDia;
    }

    public Temperatura() {
    }

    public double getTemperaturaMax() {
        return temperaturaMax;
    }

    public void setTemperaturaMax(double temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
    }

    public double getTemperaturaMin() {
        return temperaturaMin;
    }

    public void setTemperaturaMin(double temperaturaMin) {
        this.temperaturaMin = temperaturaMin;
    }

    public Date getDataDia() {
        return dataDia;
    }

    public void setDataDia(Date dataDia) {
        this.dataDia = dataDia;
    }
}
