import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;

public class RedLine extends Frame {
    public RedLine() {
        this.setSize(200, 150);
        this.setVisible(true);
    }

    @Override 
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawLine(50, 50, 100, 100);
    }

    public static void main(String[] args) {
        RedLine p = new RedLine();
    }
}