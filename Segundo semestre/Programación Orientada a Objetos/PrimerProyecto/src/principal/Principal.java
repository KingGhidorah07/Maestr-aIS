package principal;

public class Principal {

    public static void main(String[] args) {

        //Declaramos e inicializamos
        Libro libro1 = new Libro("123-4567890123", 1, true, 29.99f, (byte) 2020);
        Libro libro2 = new Libro("456-7890123456", 2, false, 45.50f, (byte) 2018);
        Libro libro3 = new Libro("789-0123456789", 3, true, 19.99f, (byte) 2022);

        // Usamos
        System.out.println(libro1.quemar());
        System.out.println(libro2.prestamo("456-7890123456"));
        libro3.leer(150);
        libro1.verLibro();
    }
}
