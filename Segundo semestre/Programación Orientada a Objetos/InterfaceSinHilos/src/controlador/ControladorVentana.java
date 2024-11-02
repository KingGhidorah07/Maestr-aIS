package controlador;

import vista.VistaVentana;

import javax.swing.JLabel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorVentana implements MouseListener {
    private VistaVentana vistaVentana;

    public ControladorVentana(VistaVentana vistaVentana) {
        this.vistaVentana = vistaVentana;
        this.vistaVentana.setVisible(true);
        this.oyentes();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vistaVentana.BtnHilo1) {
            contador(vistaVentana.LblHilo1);
        }
        if (e.getSource() == vistaVentana.BtnHilo2) {
            contador(vistaVentana.LblHilo2);
        }
        if (e.getSource() == vistaVentana.BtnHilo3) {
            contador(vistaVentana.LblHilo3);
        }
    }

    public void contador(JLabel label) {
        int contador = 0;
        while (contador < 10) {
            contador++;
            System.out.println("Contador: " + contador);
            label.setText("" + contador);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    public void oyentes() {
        vistaVentana.BtnHilo1.addMouseListener(this);
        vistaVentana.BtnHilo2.addMouseListener(this);
        vistaVentana.BtnHilo3.addMouseListener(this);
    }
}
