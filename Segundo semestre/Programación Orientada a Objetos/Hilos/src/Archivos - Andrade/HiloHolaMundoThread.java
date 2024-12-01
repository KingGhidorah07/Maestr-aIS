package hilosExtends;

public class HiloHolaMundoThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hola mundo desde un hilo con extends"+super.getName());
    }
}
