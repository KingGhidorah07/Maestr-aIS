public class Circulo extends Constantes implements Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Constantes.PI * radio * radio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Constantes.PI * radio;
    }
}
