public class Piano extends Instrumento {


    public Piano(String nombre) {
        super(nombre);
    }

    @Override
    protected void tocar() {
        System.out.println("Tocando la escala cromática de Do");
    }

    @Override
    protected void afinar() {
        System.out.println("Piano afinado en afinación estándar");
    }

}
