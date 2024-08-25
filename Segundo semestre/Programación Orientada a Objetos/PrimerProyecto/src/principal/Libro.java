package principal;

public class Libro {

    //Atributos
    private String ISB;
    private int edition;
    private boolean available;
    private float price;
    private byte year;

    //Constructor
    public Libro(String ISB, int edition, boolean available, float price, byte year) {
        this.ISB = ISB;
        this.edition = edition;
        this.available = available;
        this.price = price;
        this.year = year;
    }


    //Métodos
    public String quemar(){
        return "Quemando Libro "+ISB;
    }

    public boolean prestamo(String ISBLibro) {
        return ISBLibro.equals(ISB) && available;
    }

    //Procedure
    public void leer(int pagina){
        System.out.println("Está leyendo el libro "+ISB+ " en página "+pagina);
    }

    public void verLibro(){
        System.out.println("Estás viendo el libro "+ISB);
    }





}
