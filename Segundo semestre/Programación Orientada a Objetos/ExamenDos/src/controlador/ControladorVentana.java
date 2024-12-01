package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import vista.VistaVentana;

public class ControladorVentana implements ActionListener {

    private VistaVentana vistaVentana;

    private HiloContador hilo1;
    private HiloContador hilo2;
    private HiloContador hilo3;

    public ControladorVentana(VistaVentana vistaVentana) {
        this.vistaVentana = vistaVentana;
        this.vistaVentana.setVisible(true);
        oyentes();
    }

    private void oyentes() {
        vistaVentana.BtnHilo1.addActionListener(this);
        vistaVentana.BtnHilo2.addActionListener(this);
        vistaVentana.BtnHilo3.addActionListener(this);

        vistaVentana.BtnPlayPausaHilo1.addActionListener(this);
        vistaVentana.BtnPlayPausaHilo2.addActionListener(this);
        vistaVentana.BtnPlayPausaHilo3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vistaVentana.BtnHilo1)) {
            correrHilo(1, vistaVentana.LblHilo1, vistaVentana.BtnPlayPausaHilo1);
        }
        else if (e.getSource().equals(vistaVentana.BtnHilo2)) {
            correrHilo(2, vistaVentana.LblHilo2, vistaVentana.BtnPlayPausaHilo2);
        }
        else if (e.getSource().equals(vistaVentana.BtnHilo3)) {
            correrHilo(3, vistaVentana.LblHilo3, vistaVentana.BtnPlayPausaHilo3);
        }
        else if (e.getSource().equals(vistaVentana.BtnPlayPausaHilo1)) {
            if (hilo1 != null) {
                hilo1.acciones();
            }
        }
        else if (e.getSource().equals(vistaVentana.BtnPlayPausaHilo2)) {
            if (hilo2 != null) {
                hilo2.acciones();
            }
        }
        else if (e.getSource().equals(vistaVentana.BtnPlayPausaHilo3)) {
            if (hilo3 != null) {
                hilo3.acciones();
            }
        }
    }

    private void correrHilo(int numero, JLabel label, JButton btnPlayPausa) {
        switch (numero) {
            case 1:
                if (hilo1 == null) {
                    hilo1 = new HiloContador(label, btnPlayPausa);
                    hilo1.start();
                }
                break;
            case 2:
                if (hilo2 == null) {
                    hilo2 = new HiloContador(label, btnPlayPausa);
                    hilo2.start();
                }
                break;
            case 3:
                if (hilo3 == null) {
                    hilo3 = new HiloContador(label, btnPlayPausa);
                    hilo3.start();
                }
                break;
        }
    }

}
