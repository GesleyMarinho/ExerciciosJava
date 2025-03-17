package z_Hotel;

import z_Hotel.HotelController.HotelController;
import z_Hotel.HotelModel.HotelModel;
import z_Hotel.HotelView.HotelView;

public class Main {
    public static void main(String[] args) {

        HotelView hotelView = new HotelView();
        HotelModel hotelModel = new HotelModel(hotelView);
        HotelController hotelController = new HotelController(hotelView, hotelModel);

        hotelController.iniciar();
    }
}
