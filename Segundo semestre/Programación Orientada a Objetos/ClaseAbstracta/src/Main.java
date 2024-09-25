//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("********* Guitarra *********");
        Guitarra guera = new Guitarra("Güera");
        guera.afinar();
        guera.tocar();
        System.out.println("El nombre del instrumento es "+guera.getNombre());

        System.out.println("");
        System.out.println("********* Piano *********");
        Piano piano = new Piano("Pingüino");
        piano.afinar();
        piano.tocar();
        System.out.println("El nombre del instrumento es "+piano.getNombre());
    }
}

