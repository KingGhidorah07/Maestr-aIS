package principal;

import controlador.ControladorVentana;
import vista.VistaVentana;

public class Main {
    public static void main(String[] args) {

        VistaVentana VV = new VistaVentana();
        ControladorVentana CVV = new ControladorVentana(VV);

    }

}

