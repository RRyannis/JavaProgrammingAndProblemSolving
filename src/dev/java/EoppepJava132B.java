package dev.java;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EoppepJava132B extends JPanel implements ActionListener {
    private int x = 50, y = 50;
    private Timer timer;

    public EoppepJava132B() {
        timer = new Timer(100, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        g.fillOval(x,y,30,30);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x += 5;
        if (x > getWidth()) {
            x = 0;
        }
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Moving Ball");
        EoppepJava132B ball = new EoppepJava132B();
        frame.add(ball);
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
