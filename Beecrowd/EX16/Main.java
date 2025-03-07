package Beecrowd.EX16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        List<Double> list = new ArrayList<>(6);
        int count = 0;

        for (int i = 0; i < 6; i++) {
            double num = ler.nextDouble();
            list.add(num);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                count++;
            }
        }
        System.out.println(count + " valores positivos");
    }
}
