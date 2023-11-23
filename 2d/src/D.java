import java.awt.*;
import javax.swing.*;

import app.Punto;

import java.awt.event.*;
import java.util.Scanner;

class D extends JPanel implements ActionListener {
    // Declara el triangulo y las
    private int[] puntosX = { 100, 400, 400 };
    private int[] puntosY = { 100, 100, 400 };
    private Punto[] puntos;
    // private int Tx = 200;
    // private int Ty = 300;
    private Punto cords;

    // solid

    public D() {
        // inicializar
        this.cords = new Punto(200, 300);

        // crea botones
        JButton pb = new JButton("Trasladar");
        pb.setPreferredSize(new Dimension(100, 30));
        pb.addActionListener(this);

        JButton sb = new JButton("Zoom out");
        sb.setPreferredSize(new Dimension(100, 30));
        sb.addActionListener(this);

        JButton tb = new JButton("Zoom in");
        tb.setPreferredSize(new Dimension(100, 30));
        tb.addActionListener(this);

        JButton cb = new JButton("Rotar");
        cb.setPreferredSize(new Dimension(100, 30));
        cb.addActionListener(this);

        this.add(pb);
        this.add(sb);
        this.add(tb);
        this.add(cb);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawPolygon(puntosX, puntosY, 3);
    }

    public void getCords() {
        // JFrame window = new JFrame("Cordenadas");
        // window.setSize(150, 150);
        // window.setLocationRelativeTo(null);
        // window.setVisible(true);
        // window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JTextArea x = new JTextArea();
        // JTextArea y = new JTextArea();

        // window.add(x, BorderLayout.NORTH);
        // window.add(y, BorderLayout.CENTER);
        // Button send = new Button("Aceptar");
        // window.add(send, BorderLayout.SOUTH);

        // int[] cords = new int[2];
        // send.addActionListener(new ActionListener() {
        // @Override
        // public void actionPerformed(ActionEvent e) {
        // System.out.println(x.getText() + y.getText());
        // cords[0] = Integer.parseInt(x.getText());
        // cords[1] = Integer.parseInt(y.getText());

        // window.dispose();
        // }
        // });
        // this.Tx = cords[0];
        // this.Ty = cords[1];
        // // return cords;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();

        if (action.equals("Trasladar")) {
            // getCords();
            Scanner sc = new Scanner(System.in);
            // System.out.println("Ingrese Tx: ");
            // Tx = sc.nextInt();
            // System.out.println("Ingrese Ty: ");
            // Ty = sc.nextInt();

            for (int i = 0; i < puntosX.length; i++) {
                System.out.println("ingrese x: " + i);
                puntosX[i] = sc.nextInt();
                System.out.println("ingrese y: " + i);
                puntosY[i] = sc.nextInt();
            }

            // System.out.println("tx: "+ Tx);
            // System.out.println("ty: "+ Ty);
            // sc.close();

            // for (int i = 0; i < puntosX.length; i++) {
            // puntosX[i] += Tx;
            // puntosY[i] += Ty;
            // }
        }

        if (action.equals("Zoom out")) {
            double scale = 0.9;
            double scale2 = 0.9;
            for (int i = 0; i < puntosX.length; i++) {
                puntosX[i] = (int) (puntosX[i] * scale);
                puntosY[i] = (int) (puntosY[i] * scale2);
            }
        }

        if (action.equals("Zoom in")) {
            double scale = 2.0;
            double scale2 = 2.0;
            for (int i = 0; i < puntosX.length; i++) {
                puntosX[i] = (int) (puntosX[i] * scale);
                puntosY[i] = (int) (puntosY[i] * scale2);
            }
        }

        if (action.equals("Rotar")) {
            rotar();
        }

        repaint();
    }

    private void rotar() {
        double angulo = Math.toRadians(15);
        for (int i = 0; i < puntosX.length; i++) {
            int x = puntosX[i];
            int y = puntosY[i];
            puntosX[i] = (int) (x * Math.cos(angulo) - y * Math.sin(angulo));
            puntosY[i] = (int) (x * Math.sin(angulo) + y * Math.cos(angulo));
        }
    }

    public static void main(String[] arg) {
        JFrame ventana = new JFrame("Transformaciones");
        D obj = new D();
        ventana.add(obj);
        ventana.setSize(700, 700);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}