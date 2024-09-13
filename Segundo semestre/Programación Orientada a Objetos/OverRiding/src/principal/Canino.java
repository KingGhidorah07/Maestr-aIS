package principal;

public class Canino extends Animal{

    private byte longevidad;
    private String Alimento;

    // Constructor
    public Canino(String nombre, String raza, String color, byte longevidad, String alimento) {
        super(nombre, raza, color);
        this.longevidad = longevidad;
        this.Alimento = alimento;
    }

    // Sobrescribir método ladrar
    @Override
    public void ladrar() {
        System.out.println("El canino de raza "+ super.getRaza()+" con nombre "+super.getNombre()+ " está ladrando");
    }

    // Getters y Setters
    public byte getLongevidad() {
        return longevidad;
    }

    public void setLongevidad(byte longevidad) {
        this.longevidad = longevidad;
    }

    public String getAlimento() {
        return Alimento;
    }

    public void setAlimento(String alimento) {
        this.Alimento = alimento;
    }

    @Override
    public String toString() {
        return "Canino{" +
                "longevidad=" + longevidad +
                ", Alimento='" + Alimento + '\'' +
                '}';
    }
}
