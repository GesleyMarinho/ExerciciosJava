package z_Temperatura;

import z_Temperatura.TemperaturaController.TemperaturaController;
import z_Temperatura.TemperaturaModel.TemperaturaModel;
import z_Temperatura.TemperaturaView.TemperaturaView;

public class MainTemperatura {
    public static void main(String[] args){
        TemperaturaModel temperaturaModel = new TemperaturaModel();
        TemperaturaView temperaturaView = new TemperaturaView();
        TemperaturaController temperaturaController = new TemperaturaController( temperaturaView, temperaturaModel);

        temperaturaController.iniciar();

    }
}
