package ru.mirea.arkabaev.lab5;
import javax.swing.*;

public class Main_lab5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Push counter");
        frame.getDefaultCloseOperation();
        MyPanel panel = new MyPanel();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}