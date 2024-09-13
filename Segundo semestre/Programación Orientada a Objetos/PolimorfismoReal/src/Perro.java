public class Perro extends SerVivo {

    private String Raza;

    public Perro(int tamano, float peso, byte edad, String genero, String raza) {
        super(tamano, peso, edad, genero);
        Raza = raza;
    }

    protected void accionPerro(){
        System.out.println("Estoy ladrando");
    }


}
