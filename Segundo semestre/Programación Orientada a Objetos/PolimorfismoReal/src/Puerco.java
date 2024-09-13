public class Puerco extends SerVivo {

    private float kilos;

    public Puerco(int tamano, float peso, byte edad, String genero, float kilos) {
        super(tamano, peso, edad, genero);
        this.kilos = kilos;
    }

    protected void accionPuerco(){
        System.out.println("Estoy gruñiendo");
    }

}
