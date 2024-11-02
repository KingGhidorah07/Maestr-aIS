package vista;

import javax.swing.*;

public class VistaVentana extends JFrame {

    //Etiquetas
    public JLabel LblHilo1 = new JLabel("Hilo1");
    public JLabel LblHilo2 = new JLabel("Hilo2");
    public JLabel LblHilo3 = new JLabel("Hilo3");


    //Botones
    public JButton BtnHilo1 = new JButton("Hilo1");
    public JButton BtnHilo2 = new JButton("Hilo2");
    public JButton BtnHilo3 = new JButton("Hilo3");


    public VistaVentana() {
        config();
        etiqueta();
        botones();
    }

    private void config() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        setLayout(null);
    }

    private void etiqueta() {
        LblHilo1.setBounds(70,160,150,40);
        LblHilo2.setBounds(250,160,150,40);
        LblHilo3.setBounds(420,160,150,40);
        this.add(LblHilo1);
        this.add(LblHilo2);
        this.add(LblHilo3);
    }

    private void botones() {
        BtnHilo1.setBounds(50,250,150,40);
        BtnHilo2.setBounds(220,250,150,40);
        BtnHilo3.setBounds(390,250,150,40);
        this.add(BtnHilo1);
        this.add(BtnHilo2);
        this.add(BtnHilo3);
    }

}
