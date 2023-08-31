import java.awt.Graphics;

import javax.swing.JPanel;

class DrawPanel extends JPanel {

    /**
     * The paintComponent function in Java is used to draw lines on a graphics object.
     * 
     * @param g The parameter "g" is an instance of the Graphics class, which is used for drawing on the
     * component. It provides methods for drawing shapes, lines, text, and images on the component. In the
     * given code snippet, the paintComponent method is being overridden to perform custom painting on the
     * component.
     */
    @Override
    public void paintComponent(Graphics g) {

      super.paintComponent(g);  

      StraightLine line = new StraightLine(g);
    //   line.drawLine(2, 20, 3, 7); // draw line exercice 1
    //   line.drawLine(2, 20, 30, 7); // draw line exercice 2
    //   line.drawLine(2, 20, 55, 7); // draw line exercice 3
      line.drawLine(3, 10, 5, 30); // draw line exercice 4
      // line.drawLine(50, 50, 100, 100); // draw line exercice 4

    }

}