package TabelaCampeonato;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Time {

    String nomeTime;
    int vitoria;
    int empate;
    int derrota;
    int gols;

    public Time(String nomeTime, int vitoria, int empate, int derrota, int gols) {
        this.nomeTime = nomeTime;
        this.vitoria = vitoria;
        this.empate = empate;
        this.derrota = derrota;
        this.gols = gols;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }


}
