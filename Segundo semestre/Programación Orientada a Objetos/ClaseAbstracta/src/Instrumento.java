public abstract class Instrumento {

    protected String Nombre;

    public Instrumento(String nombre) {
        Nombre = nombre;
    }

    protected abstract void tocar();
    protected abstract void afinar();

    protected String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
