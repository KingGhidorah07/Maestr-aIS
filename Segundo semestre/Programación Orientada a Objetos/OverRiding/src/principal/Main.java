package principal;


public class Main {
    public static void main(String[] args) {

        //Declaramos e inicializamos
        Canino perro = new Canino("Pupi", "Chihuahua", "Blanco", (byte) 10, "Croquetas perron");
        Ave cotorro = new Ave("Johny", "Perico", "Verde", "Mediano", "Macho");

        //Usamos
        perro.ladrar();
        cotorro.ladrar();

        //Mostramos
        System.out.println("Perro: " + perro.getNombre() + ", " + perro.getRaza() + ", " + perro.getColor() + ", " + perro.getLongevidad() + " años, " + perro.getAlimento());
        System.out.println("Cotorro: " + cotorro.getNombre() + ", " + cotorro.getRaza() + ", " + cotorro.getColor() + ", " + cotorro.getTamano() + ", " + cotorro.getGenero());

    }
}