public class Guitarra extends Instrumento {


    public Guitarra(String nombre) {
        super(nombre);
    }

    @Override
    protected void tocar() {
        System.out.println("Tocando la escala de DO");
    }

    @Override
    protected void afinar() {
        System.out.println("Gitarra afinada en afinación estándar");
    }


}
