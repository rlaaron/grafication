import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.List;

public class FinalProject extends JPanel implements ActionListener{
    List<Punto> points;
    Prism prism;
    public FinalProject(double radius, double centerX, double centerY) {
        prism = new Prism(radius, centerX, centerY);

        JButton triangulo  = new JButton("triangulo");
        triangulo.setPreferredSize(new Dimension(100, 30));
        triangulo.addActionListener(this);

        JButton cuadrado  = new JButton("cuadrado");
        cuadrado.setPreferredSize(new Dimension(100, 30));
        cuadrado.addActionListener(this);

        JButton pentagono  = new JButton("pentagono");
        pentagono.setPreferredSize(new Dimension(100, 30));
        pentagono.addActionListener(this);

        JButton hexagono  = new JButton("hexagono");
        hexagono.setPreferredSize(new Dimension(100, 30));
        hexagono.addActionListener(this);


        this.add(triangulo);
        this.add(cuadrado);
        this.add(pentagono);
        this.add(hexagono);



        points = prism.getPoints(4);

        // for(Punto p : points){
        //     System.out.println(p);
        // }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();

        switch(action){
            case "triangulo":
                points = prism.getPoints(3);
                repaint();
                break;
            case "cuadrado":
                points = prism.getPoints(4);
                repaint();
                break;
            case "pentagono":
                points = prism.getPoints(5);
                repaint();
                break;
            case "hexagono":
                points = prism.getPoints(6);
                repaint();
                break;
        }

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        Punto externalPoint = new Punto(400,50,1);
        int weight = 10;

        for(int i = 0; i < points.size(); i++){
            g.setColor(Color.RED);
            Punto p = points.get(i);
            // g.fillRect((int)p.x, (int)p.y, 5, 5);
            g.fillOval((int)p.x-5, (int)p.y-5, weight, weight);
            g.fillOval(externalPoint.x-5, externalPoint.y-5, weight, weight);

            if(i == points.size() - 1){
                // g.setColor(Color.BLUE);
                g.setColor(Color.RED);
                g.drawLine(p.x, p.y, points.get(0).x, points.get(0).y);
                g.setColor(Color.RED);
                g.drawLine(p.x, p.y, externalPoint.x, externalPoint.y);
            }else{
                // g.setColor(Color.BLUE);
                g.setColor(Color.RED);
                g.drawLine(p.x, p.y, points.get(i+1).x, points.get(i+1).y);
                g.setColor(Color.RED);
                g.drawLine(p.x, p.y, externalPoint.x, externalPoint.y);
            }
        }
    }

    public static void main(String[] args) {
        double radius = 50;
        double centerX = 200;
        double centerY = 200;
        JFrame fr = new JFrame("Prism");
        FinalProject fj = new FinalProject(radius, centerX, centerY);

        fr.add(fj);
        fr.setSize(500, 500);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

   
}
