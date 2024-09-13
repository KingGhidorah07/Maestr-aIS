package principal;


public class Main {
    public static void main(String[] args) {

        //Inicializamos y creamos
        Calculadora calc1 = new Calculadora("Científica", "Negra");

        //Usamos los métodos

        // Sumas
        System.out.println();
        System.out.println("---------- Operación suma ----------");
        System.out.println();
        System.out.println("Suma de 2 enteros: " + calc1.sumar(10, 20));
        System.out.println("Suma de 3 enteros: " + calc1.sumar(10, 20, 30));
        System.out.println("Suma de 2 floats: " + calc1.sumar(10.5f, 20.5f));
        System.out.println("Suma de 3 floats: " + calc1.sumar(10.5f, 20.5f, 30.5f));
        System.out.println("Suma de 2 doubles: " + calc1.sumar(10.5d, 20.5d));
        System.out.println("Suma de 3 doubles: " + calc1.sumar(10.5d, 20.5d, 30.5d));

        // Restas
        System.out.println();
        System.out.println("---------- Operación resta ----------");
        System.out.println("Resta de 2 enteros: " + calc1.restar(20, 10));
        System.out.println("Resta de 3 enteros: " + calc1.restar(30, 20, 10));
        System.out.println("Resta de 2 floats: " + calc1.restar(20.5f, 10.5f));
        System.out.println("Resta de 3 floats: " + calc1.restar(30.5f, 20.5f, 10.5f));
        System.out.println("Resta de 2 doubles: " + calc1.restar(20.5d, 10.5d));
        System.out.println("Resta de 3 doubles: " + calc1.restar(30.5d, 20.5d, 10.5d));

        // Multiplicaciones
        System.out.println();
        System.out.println("---------- Operación multiplicación ----------");
        System.out.println("Multiplicación de 2 enteros: " + calc1.multiplicar(10, 20));
        System.out.println("Multiplicación de 3 enteros: " + calc1.multiplicar(10, 20, 30));
        System.out.println("Multiplicación de 2 floats: " + calc1.multiplicar(10.5f, 20.5f));
        System.out.println("Multiplicación de 3 floats: " + calc1.multiplicar(10.5f, 20.5f, 30.5f));
        System.out.println("Multiplicación de 2 doubles: " + calc1.multiplicar(10.5d, 20.5d));
        System.out.println("Multiplicación de 3 doubles: " + calc1.multiplicar(10.5d, 20.5d, 30.5d));

        // Divisiones
        System.out.println();
        System.out.println("---------- Operación división ----------");
        System.out.println("División de 2 enteros: " + calc1.dividir(20, 10));
        System.out.println("División de 3 enteros: " + calc1.dividir(30, 20, 10));
        System.out.println("División de 2 floats: " + calc1.dividir(20.5f, 10.5f));
        System.out.println("División de 3 floats: " + calc1.dividir(30.5f, 20.5f, 10.5f));
        System.out.println("División de 2 doubles: " + calc1.dividir(20.5d, 10.5d));
        System.out.println("División de 3 doubles: " + calc1.dividir(30.5d, 20.5d, 10.5d));

        //Mostramos los datos
        System.out.println();
        System.out.println(calc1);
    }
}