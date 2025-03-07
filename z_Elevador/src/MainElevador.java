import ElevadorController.ElevadorController;
import ElevadorModel.ElevadorModel;
import ElevadorView.ElevadorView;

public class MainElevador {
    public static void main(String[] args) {

        ElevadorView elevadorView = new ElevadorView();
        ElevadorModel elevadorModel = new ElevadorModel();

         ElevadorController elevadorController = new ElevadorController(elevadorModel, elevadorView);
         elevadorController.iniciar();
    }
}