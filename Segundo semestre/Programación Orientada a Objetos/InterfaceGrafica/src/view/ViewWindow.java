package view;

import javax.swing.*;
import java.awt.*;

public class ViewWindow extends JFrame {

    //Botones
    public JButton BtnSalir = new JButton("Salir");
    public JButton BtnVerde = new JButton("Verde");
    public JButton BtnRojo = new JButton("Rojo");
    public JButton BtnVer = new JButton("Ver");
    public JButton BtnOcultar = new JButton("Ocultar");

    //Menus
    JMenuBar BarraDeMenu = new JMenuBar();
    JMenu MenuArchivo = new JMenu("Archivo");
    public JMenuItem MenuArchivoSalir = new JMenuItem("Salir");

    //Imagen
    ImageIcon icono = new ImageIcon(getClass().getResource("/images/udg.png"));

    public ViewWindow() throws HeadlessException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setTitle("View Window");
        this.getContentPane().setBackground(Color.BLUE);
        this.setLayout(new FlowLayout());
        this.setIconImage(icono.getImage());
        botones();
        menus();
    }

    private void menus() {

        this.setJMenuBar(BarraDeMenu);
        BarraDeMenu.add(MenuArchivo);
        MenuArchivo.add(MenuArchivoSalir);

    }

    private void botones() {
        this.add(BtnSalir);
        this.add(BtnVerde);
        this.add(BtnRojo);
        this.add(BtnVer);
        this.add(BtnOcultar);
    }


}
