package fr.ynov.java.java.cours.gui.simple;

import javax.swing.*;

public class MyWindow extends JFrame {

    public MyWindow() {
        super("My Window");
    }

    public void display() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
