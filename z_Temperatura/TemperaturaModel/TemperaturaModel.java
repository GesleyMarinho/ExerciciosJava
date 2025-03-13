package z_Temperatura.TemperaturaModel;

import z_Temperatura.Temperatura.Temperatura;
import z_Temperatura.TemperaturaView.TemperaturaView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TemperaturaModel {

    private TemperaturaView view;
    private List<Temperatura> temperaturaList;
    Scanner scanner = new Scanner(System.in);


    public TemperaturaModel() {

        this.temperaturaList = new ArrayList<>();
        this.view = new TemperaturaView();
    }

    public void adicinarTemperaturas() {
       /* String op;
        do {

            System.out.print("Data do Dia: ");
            String dataEntradaStr = scanner.nextLine();

            System.out.print("Maior temperatura no dia: ");
            double tempMax = scanner.nextDouble();
            System.out.print("Menor temperatura do dia: ");
            double tempMin = scanner.nextDouble();

            scanner.nextLine();

            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

            try {
                Date dataEntrada = format.parse(dataEntradaStr);
                System.out.println(dataEntrada + " data");
                System.out.println(tempMax + "Maxima");
                System.out.println(tempMin + " Minina");

                temperaturaList.add(new Temperatura(tempMax, tempMin, dataEntrada));

                view.mensagem("Data e temperaturas adicionados na lista");


           } catch (ParseException e) {
                System.out.println("Formato de data inválido! Use dd/MM/yyyy");
            }

            System.out.print("Deseja cadastrar mais um dia ? ");
            op = scanner.nextLine().toUpperCase();

        } while (op.equalsIgnoreCase("S"));*/

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        try {
            // Criando três registros fixos
            temperaturaList.add(new Temperatura(30.5, 20.2, format.parse("01/03/2024")));
            temperaturaList.add(new Temperatura(28.0, 18.5, format.parse("02/03/2024")));
            temperaturaList.add(new Temperatura(32.8, 22.1, format.parse("03/03/2024")));

            view.mensagem("3 registros de temperatura foram adicionados automaticamente.");

        } catch (ParseException e) {
            System.out.println("Erro ao converter a data. Verifique o formato.");
        }

        view.Menu();

    }

    public void temperaturaList() {

        if (temperaturaList.isEmpty()) {
            System.out.println("Nenhuma temperatura cadastrada");

        } else {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");


            for (int i = 0; i < temperaturaList.size(); i++) {
                Temperatura temperatura = temperaturaList.get(i);
                String dataFormatada = format.format(temperatura.getDataDia());
                /*Depois testar a data não formatada */
                System.out.println("NO Dia " + dataFormatada + " a MAIOR Temperatura foi de: " +
                        temperaturaList.get(i).getTemperaturaMax() + " e a MENOR  Temperatura foi de: " + temperaturaList.get(i).getTemperaturaMin());
            }
            System.out.println("-----------------------");
        }
    }

    public void buscarTemperaturaData(String dateBusca) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dataBusca = format.parse(dateBusca);
            boolean encontrado = false;

            for (Temperatura temperatura : temperaturaList) {

                if (format.format(temperatura.getDataDia()).equals(format.format(dataBusca))) {

                    System.out.println("No dia " + dateBusca + ", a maior temperatura foi: " +
                            temperatura.getTemperaturaMax() + "°C e a menor temperatura foi: " +
                            temperatura.getTemperaturaMin() + "°C.");
                    encontrado = true;
                    break;
                }

            }

            if (!encontrado) {
                view.mensagem("Nenhum registro encontrado para a data: " + dateBusca);
            }
        } catch(ParseException e) {
            view.mensagem("Formato de data inválido! Use dd/MM/yyyy");
        }
    }

    public void exibirMaiorEMenorTemratura(){
        double maior =0;
        double menor  = 99;

        if (temperaturaList.isEmpty()) {
            view.mensagem("Nenhuma temperatura cadastrada.");
            return;
        }

        for (int i = 0; i< temperaturaList.size(); i++){
            if(temperaturaList.get(i).getTemperaturaMax() > maior){
                maior = temperaturaList.get(i).getTemperaturaMax();
            }

            if(temperaturaList.get(i).getTemperaturaMin() < menor){
                menor = temperaturaList.get(i).getTemperaturaMin();
            }


        }
        view.mensagem("A Maior temperatura Registrada foi de "+ maior +   "°C." + " e a Menor temperatura foi de: " + menor + "°C." );
    }

    public void  mediaTemperatura(){
        double somaMax= 0;
        double somaMin =0;

        for(Temperatura temperatura : temperaturaList){
            somaMax += temperatura.getTemperaturaMax();
            somaMin += temperatura.getTemperaturaMin();
        }

        double mediaMax = somaMax / temperaturaList.size();
        double mediaMin = somaMin / temperaturaList.size();

        view.mensagem(String.format("Média da temperatura máxima: %.2f°C", mediaMax));
        view.mensagem(String.format("Média da temperatura mínima: %.2f°C", mediaMin));
    }
}