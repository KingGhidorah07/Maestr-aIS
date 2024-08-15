import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre = "";
        Integer calificacion1 = 0;
        Integer calificacion2 = 0;
        Integer calificacion3 = 0;
        Integer calificacion4 = 0;
        Integer calificacion5 = 0;
        Integer promedio = 0;
        System.out.print("Ingrese su nombre: ");
        nombre = teclado.nextLine();
        System.out.println();
        System.out.print("Ingrese su calificacion 1: ");
        calificacion1 = teclado.nextInt();
        System.out.print("Ingrese su calificacion 2: ");
        calificacion2 = teclado.nextInt();
        System.out.print("Ingrese su calificacion 3: ");
        calificacion3 = teclado.nextInt();
        System.out.print("Ingrese su calificacion 4: ");
        calificacion4 = teclado.nextInt();
        System.out.print("Ingrese su calificacion 5: ");
        calificacion5 = teclado.nextInt();
        promedio = (calificacion1+calificacion2+calificacion3+calificacion4)/5;
        System.out.println("El promedio de "+nombre+" es: " + promedio);

    }
}