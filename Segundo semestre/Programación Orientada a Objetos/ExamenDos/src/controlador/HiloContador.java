package controlador;

import javax.swing.JButton;
import javax.swing.JLabel;

public class HiloContador extends Thread implements Runnable {

    private final JLabel Label;
    private final JButton ButtonPlayPausa;
    private boolean enEjecucion = false;
    int contador = 0;

    public HiloContador(JLabel Label, JButton ButtonPlayPausa) {
        this.Label = Label;
        this.ButtonPlayPausa = ButtonPlayPausa;
        enEjecucion = true;
    }

    @Override
    public void run() {
        while (contador < 20) {
            synchronized (this) {
                if (enEjecucion) {
                    contador++;
                    Label.setText("" + contador);
                    try {
                        Thread.sleep(500);
                    }
                    catch (InterruptedException ex) {
                    }
                }
                else {
                    try {
                        wait();
                    }
                    catch (InterruptedException ex) {
                    }
                }
            }
        }
    }

    public void acciones() {

        this.interrupt();

        if (enEjecucion) {
            enEjecucion = false;
            ButtonPlayPausa.setText("Reanudar");
        }
        else {
            enEjecucion = true;
            ButtonPlayPausa.setText("Pausar");
        }
    }
}
