package controller;

import view.ViewWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ViewWindowController implements MouseListener, ActionListener {

    private ViewWindow viewWindow;

    public ViewWindowController(ViewWindow viewWindow) {
        this.viewWindow = viewWindow;
        this.viewWindow.setVisible(true);
        oyentes();
    }



    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == viewWindow.BtnSalir) {
            int opc = JOptionPane.showConfirmDialog(viewWindow, "Salir?", "Amo R",0,1);
            if(opc == 0) {
                System.exit(0);
            }
        }
        if (e.getSource() == viewWindow.BtnRojo){
            viewWindow.BtnRojo.setBackground(Color.RED);
        }
        if (e.getSource() == viewWindow.BtnVerde){
            viewWindow.BtnVerde.setBackground(Color.GREEN);
        }
        if (e.getSource() == viewWindow.BtnOcultar){
            viewWindow.BtnSalir.setVisible(false);
        }
        if (e.getSource() == viewWindow.BtnVer){
            viewWindow.BtnSalir.setVisible(true);
        }


    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    private void oyentes() {
        viewWindow.BtnSalir.addMouseListener(this);
        viewWindow.BtnOcultar.addMouseListener(this);
        viewWindow.BtnRojo.addMouseListener(this);
        viewWindow.BtnVerde.addMouseListener(this);
        viewWindow.BtnVer.addMouseListener(this);

        //Oyentes para Menus
        viewWindow.MenuArchivoSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewWindow.MenuArchivoSalir) {
            System.exit(0);
        }
    }
}
