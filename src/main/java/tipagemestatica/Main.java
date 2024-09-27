package main.java.tipagemestatica;

import javax.swing.JFrame;

import main.java.tipagemestatica.formulario.Interface;

public class Main extends JFrame {
    

    public static void main(String[] args) {
        Interface Interface = new Interface();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Interface.setVisible(true);
            }
        });
    }
}