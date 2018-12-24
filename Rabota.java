package ru.mirea.arkabaev.lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rabota extends JFrame{
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton button1 = new JButton(" + ");
    JButton button2 = new JButton(" - ");
    JButton button3 = new JButton(" x ");
    JButton button4 = new JButton(" / ");
    JButton button5 = new JButton(" ^2 ");
    JButton button6 = new JButton(" SQR ");
    Font font = new Font("Times new roman",Font.BOLD,50);

    private Rabota() {

        super("Калькулятор");
        setLayout(new FlowLayout());
        setSize(400, 100);
        add(new JLabel("Число А"));
        add(jta1);
        add(new JLabel("Число B"));
        add(jta2);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null,
                            "Result = "+(x1+x2),
                            "Attention!", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception e1){
                    JOptionPane.showMessageDialog(null,
                            "Incorrect number.\nTry again!",
                            "Attention!", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null,
                            "Result = "+(x1-x2),
                            "Attention!", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception e2){
                    JOptionPane.showMessageDialog(null,
                            "Incorrect number.\nTry again!",
                            "Attention!",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null,
                            "Result = "+(x1*x2),
                            "Attention!", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception e3){
                    JOptionPane.showMessageDialog(null,
                            "Incorrect number.\nTry again!",
                            "Attention!",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null,
                            "Result = "+(x1/x2),
                            "Attention!", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception e4){
                    JOptionPane.showMessageDialog(null,
                            "Incorrect number.\nTry again!",
                            "Attention!",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null,
                            "Result = "+(Math.pow(x1,2)),
                            "Attention!", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception e5){
                    JOptionPane.showMessageDialog(null,
                            "Incorrect number.\nTry again!",
                            "Attention!",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null,
                            "Result = "+(Math.sqrt(x1)),
                            "Attention!", JOptionPane.INFORMATION_MESSAGE);
                }
                catch (Exception e6){
                    JOptionPane.showMessageDialog(null,
                            "Incorrect number.\nTry again!",
                            "Attention!",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setVisible(true);

    }

    public static void main(String[] args) {
        new Rabota();
    }
}