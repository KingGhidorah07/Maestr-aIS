package principal;

import controller.ViewWindowController;
import view.ViewWindow;

public class AppSystem {
    public static void main(String[] args) {
        //Crear 2 objetos
        ViewWindow viewWindow = new ViewWindow();
        ViewWindowController viewWindowController = new ViewWindowController(viewWindow);
    }
}
