package ru.mirea.arkabaev.lab5;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyPanel extends JPanel {
    private int count1 = 0;
    private int count2 = 0;
    private JButton push = new JButton("Madrid");
    private JButton push1;
    private JLabel label;
    private JLabel label2;

    public MyPanel() {
        push = new JButton("Madrid");
        push.addActionListener(new ButtonListener());
        add(push);
        push1 = new JButton("Real");
        push1.addActionListener(new ButtonListener2());
        add(push1);
        label = new JLabel("Madrid team score:" + count1);
        add(label);
        setBackground(Color.pink);
        setPreferredSize(new Dimension(300, 40));
        label2 = new JLabel("Real team score:" + count2);
        add(label2);
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(300, 40));
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            count1++;
            label.setText("Pushes " + count1);
        }
    }

    private class ButtonListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            count2++;
            label2.setText("Pushes " + count2);
        }
    }
}