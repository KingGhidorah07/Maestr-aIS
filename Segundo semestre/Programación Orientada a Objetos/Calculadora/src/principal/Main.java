package principal;


public class Main {
    public static void main(String[] args) {

        //Inicializamos y creamos
        Calculadora calc1 = new Calculadora("Científica", "Negra");

        //Usamos
        System.out.println("Suma de 2 enteros: " + calc1.sumar(10, 20));
        System.out.println("Suma de 3 enteros: " + calc1.sumar(10, 20, 30));
        System.out.println("Suma de 2 floats: " + calc1.sumar(10.5f, 20.5f));
        System.out.println("Suma de 3 floats: " + calc1.sumar(10.5f, 20.5f, 30.5f));
        System.out.println("Suma de 2 doubles: " + calc1.sumar(10.5d, 20.5d));
        System.out.println("Suma de 3 doubles: " + calc1.sumar(10.5d, 20.5d, 30.5d));

        //Mostramos los datos
        System.out.println(calc1);
    }
}