public class Main {
    public static void main(String[] args) {

        //Salto de línea
        System.out.println("\n");
        //Instnacias
        Cuadrado Cuadro = new Cuadrado(2);
        Rectangulo Ventana = new Rectangulo(3, 4);
        Circulo Circulito = new Circulo(5);
        Humano juanita = new Humano();


        //HUMANO
        juanita.calcular(Circulito);
        System.out.println("\n");
        juanita.calcular(Cuadro);
        System.out.println("\n");
        juanita.calcular(Ventana);


    }
}