package principal;

public class Ave extends Animal{

    private String Tamano;
    private String Genero;

    // Constructor
    public Ave(String Nombre, String Raza, String Color, String Tamano, String Genero) {
        super(Nombre, Raza, Color);
        this.Tamano = Tamano;
        this.Genero = Genero;
    }

    // Sobrescribir método ladrar
    @Override
    public void ladrar() {
        System.out.println("El ave de tipo " +super.getRaza()+" que lleva por nombre "+super.getNombre() +" está graznando");
    }

    // Getters y Setters
    public String getTamano() {
        return Tamano;
    }

    public void setTamano(String tamano) {
        this.Tamano = tamano;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        this.Genero = genero;
    }


    @Override
    public String toString() {
        return "Ave{" +
                "Tamano='" + Tamano + '\'' +
                ", Genero='" + Genero + '\'' +
                '}';
    }
}
