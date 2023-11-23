import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class App extends JPanel implements ActionListener {
    // Declara el triangulo y los puntos
    private Punto p1 = new Punto(50, 50, 1);
    private Punto p2 = new Punto(150, 50, 1);
    private Punto p3 = new Punto(150, 150, 1);
    private Punto p4 = new Punto(50, 150, 1);
    private Punto p5 = new Punto(300, 300, 10);
    private int option;


    // private int{} lines = {{},{},{}};

    public App() {
        // crea botones
        JButton pb = new JButton("frente");
        pb.setPreferredSize(new Dimension(100, 30));
        pb.addActionListener(this);

        JButton sb = new JButton("lado");
        sb.setPreferredSize(new Dimension(100, 30));
        sb.addActionListener(this);

        JButton tb = new JButton("arriba");
        tb.setPreferredSize(new Dimension(100, 30));
        tb.addActionListener(this);

        JButton t3 = new JButton("3D");
        t3.setPreferredSize(new Dimension(100, 30));
        t3.addActionListener(this);

        this.add(pb);
        this.add(sb);
        this.add(tb);
        this.add(t3);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // g.drawPolygon(puntosX, puntosY, 3);
        // X1,Y1,x2,y2
        // g.drawLine(punto1[0], punto2[0], punto1[1],punto2[1] );
        // g.drawLine(punto2[0], punto2[0], punto3[1],punto3[1] );
        // g.drawLine(punto3[0], punto3[0], punto4[1],punto4[1] );
        // g.drawLine(punto4[0], punto4[0], punto1[1],punto1[1] );

        g.setColor(Color.RED);
        switch (this.option) {
            case 1:
                g.drawLine(p1.x, p1.y, p2.x, p2.y);
                // g.setColor(Color.BLUE);
                g.drawLine(p2.x, p2.y, p3.x, p3.y);
                // g.setColor(Color.GREEN);
                g.drawLine(p3.x, p3.y, p4.x, p4.y);
                // g.setColor(Color.YELLOW);
                g.drawLine(p4.x, p4.y, p1.x, p1.y);
                break;
            case 2:
                System.out.println("lado");
                // g.setColor(Color.YELLOW);
                // g.drawLine(p4.x, p4.z, p1.x, p1.z);
                g.drawLine(p4.x, p4.y, p1.x, p1.y);
                break;
            // g.setColor(Color.RED);
            case 3:
                System.out.println("arriba");
                g.drawLine(p3.x, p3.y, p4.x, p4.y);
                // g.drawLine(p3.y, p3.z, p4.y, p4.z);
                break;
            case 4:
                System.out.println("3D");
                g.setColor(Color.BLUE);
                g.drawLine(p1.x, p1.y, p2.x, p2.y);
                g.drawLine(p2.x, p2.y, p3.x, p3.y);
                g.drawLine(p3.x, p3.y, p4.x, p4.y);
                g.drawLine(p4.x, p4.y, p1.x, p1.y);

                g.drawLine(p1.x, p1.y, p5.x, p5.y);
                g.drawLine(p2.x, p2.y, p5.x, p5.y);
                g.drawLine(p3.x, p3.y, p5.x, p5.y);
                g.drawLine(p4.x, p4.y, p5.x, p5.y);
            default:
                break;
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();

        if (action.equals("frente")) {
            option = 1;

        }

        if (action.equals("lado")) {
            option = 2;
        }

        if (action.equals("arriba")) {
            option = 3;
        }

        if (action.equals("3D")) {
            option = 4;
        }

        repaint();
    }

    public static void main(String[] arg) {
        JFrame ventana = new JFrame("Transformaciones");
        System.out.println("here");
        App obj = new App();
        ventana.add(obj);
        ventana.setSize(700, 700);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}