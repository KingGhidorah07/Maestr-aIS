//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //UpCasting
        System.out.println("UpCasting de Ser vivo Humano");
        SerVivo Evelyn = new Humano(4, 80, (byte) 23, "Femenino", "Mexicano");
        Evelyn.accionSerVivo();
        System.out.println();
        System.out.println("UpCasting de Ser vivo Perro");
        SerVivo Pupi = new Perro(1, 3, (byte) 8, "Macho", "Chihuahua");
        Pupi.accionSerVivo();
        System.out.println();
        System.out.println("UpCasting de Ser vivo Puerco");
        SerVivo Porqui = new Puerco(2, 100, (byte) 2, "Macho", 100);
        Porqui.accionSerVivo();

        System.out.println("\n");
        //DownCasting
        System.out.println("DownCasting de Ser vivo Humano");
        Humano MismaEvelyn = (Humano)Evelyn;
        MismaEvelyn.accionSerVivo();
        MismaEvelyn.accionHumano();
        System.out.println();
        System.out.println("DownCasting de Ser vivo Perro");
        Perro MismoPupi = (Perro) Pupi;
        MismoPupi.accionSerVivo();
        MismoPupi.accionPerro();
        System.out.println();
        System.out.println("DownCasting de Ser vivo Puerco");
        Puerco MismoPorqui = (Puerco) Porqui;
        MismoPorqui.accionSerVivo();
        MismoPorqui.accionPuerco();
    }
}