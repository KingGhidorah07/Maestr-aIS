
import hilosExtends.HiloHolaMundoThread;
import hilosRunnable.HiloHolaMundorunnable;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        HiloHolaMundoThread hilo1 = new HiloHolaMundoThread();
        HiloHolaMundoThread hilo2 = new HiloHolaMundoThread();
        HiloHolaMundoThread hilo3 = new HiloHolaMundoThread();
        HiloHolaMundoThread hilo4 = new HiloHolaMundoThread();
        HiloHolaMundoThread hilo5 = new HiloHolaMundoThread();

        HiloHolaMundorunnable hilo1Runnable = new HiloHolaMundorunnable();
        Thread Hilo1 = new Thread(hilo1Runnable);
        Thread Hilo2 = new Thread(hilo1Runnable);
        Thread Hilo3 = new Thread(hilo1Runnable);
        Thread Hilo4 = new Thread(hilo1Runnable);
        Thread Hilo5 = new Thread(hilo1Runnable);



        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();

        Hilo1.start();
        Hilo2.start();
        Hilo3.start();
        Hilo4.start();
        Hilo5.start();

        while (hilo1.isAlive() || hilo2.isAlive() || hilo3.isAlive() || hilo4.isAlive() || hilo5.isAlive() || Hilo1.isAlive() || Hilo2.isAlive() || Hilo3.isAlive() || Hilo4.isAlive() || Hilo5.isAlive());
        System.out.println("Por fin terminé");


    }
}
