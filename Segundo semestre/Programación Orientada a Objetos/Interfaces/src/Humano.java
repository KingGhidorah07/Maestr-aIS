public class Humano {

    public void calcular(Figura figurita) {
        System.out.println("** "+ figurita.getClass().getSimpleName() + " **");
        System.out.println("El área es: " + figurita.getArea());
        System.out.println("El perimetro es: " + figurita.getPerimetro());

    }

}
