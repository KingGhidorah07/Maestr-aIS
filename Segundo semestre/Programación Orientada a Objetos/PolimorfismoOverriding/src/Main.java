//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SerVivo juana = new Humano();  // Juana como Humano
        System.out.println(juana.accion());

        juana = new Perro();  // Juana como Perro
        System.out.println(juana.accion());

        juana = new Puerco();  // Juana como Puerco
        System.out.println(juana.accion());
    }
}

