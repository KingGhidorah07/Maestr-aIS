package hilosRunnable;

public class HiloHolaMundorunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hola mundo desde un hilo runnable" + Thread.currentThread().getName());
    }
}
