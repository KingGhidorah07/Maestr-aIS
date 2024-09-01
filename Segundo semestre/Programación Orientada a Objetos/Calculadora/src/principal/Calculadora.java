package principal;


public class Calculadora {
    private String tipo;
    private String color;

    // Constructor
    public Calculadora(String tipo, String color) {
        this.tipo = tipo;
        this.color = color;
    }

    // Métodos sobrecargados para sumar
    public int sumar(int a, int b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public float sumar(float a, float b) {
        return a + b;
    }

    public float sumar(float a, float b, float c) {
        return a + b + c;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public double sumar(double a, double b, double c) {
        return a + b + c;
    }

    // Métodos sobrecargados para restar
    public int restar(int a, int b) {
        return a - b;
    }

    public int restar(int a, int b, int c) {
        return a - b - c;
    }

    public float restar(float a, float b) {
        return a - b;
    }

    public float restar(float a, float b, float c) {
        return a - b - c;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double restar(double a, double b, double c) {
        return a - b - c;
    }

    // Métodos sobrecargados para multiplicar
    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int multiplicar(int a, int b, int c) {
        return a * b * c;
    }

    public float multiplicar(float a, float b) {
        return a * b;
    }

    public float multiplicar(float a, float b, float c) {
        return a * b * c;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double multiplicar(double a, double b, double c) {
        return a * b * c;
    }

    // Métodos sobrecargados para dividir
    public int dividir(int a, int b) {
        return a / b;
    }

    public int dividir(int a, int b, int c) {
        return a / b / c;
    }

    public float dividir(float a, float b) {
        return a / b;
    }

    public float dividir(float a, float b, float c) {
        return a / b / c;
    }

    public double dividir(double a, double b) {
        return a / b;
    }

    public double dividir(double a, double b, double c) {
        return a / b / c;
    }

    // Método toString para mostrar los datos de manera correcta
    @Override
    public String toString() {
        return "Calculadora [Tipo: " + tipo + ", Color: " + color + "]";
    }


}
