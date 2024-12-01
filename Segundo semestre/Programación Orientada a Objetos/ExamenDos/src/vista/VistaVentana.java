package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VistaVentana extends JFrame {

    public JLabel LblHilo1 = new JLabel("Hilo 1");
    public JLabel LblHilo2 = new JLabel("Hilo 2");
    public JLabel LblHilo3 = new JLabel("Hilo 3");

    public JButton BtnHilo1 = new JButton("Hilo 1");
    public JButton BtnHilo2 = new JButton("Hilo 2");
    public JButton BtnHilo3 = new JButton("Hilo 3");

    public JButton BtnPlayPausaHilo1 = new JButton("Pausar");
    public JButton BtnPlayPausaHilo2 = new JButton("Pausar");
    public JButton BtnPlayPausaHilo3 = new JButton("Pausar");

    public VistaVentana() {
        config();
        etiquetas();
        botones();
    }

    private void config() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640, 400);
        setLocationRelativeTo(null);
        setTitle("Examen Unidad II - Contador gráfico con hilos - Uso de Synchronize");
        setLayout(null);
    }

    private void etiquetas() {
        LblHilo1.setBounds(50, 50, 100, 30);
        LblHilo2.setBounds(250, 50, 100, 30);
        LblHilo3.setBounds(450, 50, 100, 30);

        add(LblHilo1);
        add(LblHilo2);
        add(LblHilo3);
    }

    private void botones() {
        BtnHilo1.setBounds(50, 200, 120, 30);
        BtnPlayPausaHilo1.setBounds(50, 300, 120, 24);

        BtnHilo2.setBounds(250, 200, 120, 30);
        BtnPlayPausaHilo2.setBounds(250, 300, 120, 24);

        BtnHilo3.setBounds(450, 200, 120, 30);
        BtnPlayPausaHilo3.setBounds(450, 300, 120, 24);

        add(BtnHilo1);
        add(BtnPlayPausaHilo1);
        add(BtnHilo2);
        add(BtnPlayPausaHilo2);
        add(BtnHilo3);
        add(BtnPlayPausaHilo3);
    }


}
