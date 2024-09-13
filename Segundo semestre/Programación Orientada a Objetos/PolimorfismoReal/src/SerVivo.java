public class SerVivo
{
    protected int tamano;
    protected float peso;
    protected String Genero;
    protected byte edad;


    public SerVivo(int tamano, float peso, byte edad, String genero) {
        this.tamano = tamano;
        this.peso = peso;
        this.edad = edad;
        Genero = genero;
    }

    protected void accionSerVivo(){
        System.out.println("Estoy respirando");
    }

}
