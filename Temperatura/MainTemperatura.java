package Temperatura;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MainTemperatura {
    public static void main(String[] args) {
        Scanner ler = new Scanner((System.in));

        DecimalFormat df = new DecimalFormat("#,###.00");
        //df.format(1234.00);

        double F, k, Re, Ra = 0;
        double c = 2.43;

        F = c * 1.8 + 32;
        k = c + 273.15;
        Re = c * 0.8;
        Ra = c * 1.8 + 32 + 459.67;

        System.out.println("Temperatura em Celsius é: " + c);
        System.out.println("Temperatura em Fahrenheit é: " + df.format(F));
        System.out.println("Temperatura em Rankine  é: " + df.format(Ra));
        System.out.println("Temperatura em Réaumur  é: " + k);


    }
}
