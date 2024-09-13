public class Humano extends SerVivo {

    private String Nacionalidad;

    public Humano(int tamano, float peso, byte edad, String genero, String nacionalidad) {
        super(tamano, peso, edad, genero);
        Nacionalidad = nacionalidad;
    }

    protected void accionHumano(){
        System.out.println("Estoy cantando");
    }

}
