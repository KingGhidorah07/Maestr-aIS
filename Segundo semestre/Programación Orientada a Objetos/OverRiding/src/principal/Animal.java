package principal;

public class Animal {

    private String Nombre;
    private String Raza;
    private String Color;

    // Constructor
    public Animal(String nombre, String raza, String color) {
        this.Nombre = nombre;
        this.Raza = raza;
        this.Color = color;
    }

    // Método ladrar
    public void ladrar() {
        System.out.println("El animal hace un sonido.");
    }

    // Getters y Setters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        this.Raza = raza;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Nombre='" + Nombre + '\'' +
                ", Raza='" + Raza + '\'' +
                ", Color='" + Color + '\'' +
                '}';
    }
}
