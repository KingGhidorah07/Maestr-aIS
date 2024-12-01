package principal;

import controlador.ControladorVentana;
import vista.VistaVentana;

public class Main {

    public static void main(String[] args) {
        VistaVentana vistaVentana = new VistaVentana();
        ControladorVentana controladorVentana = new ControladorVentana(vistaVentana);
    }
}
