import java.awt.Graphics;
import java.awt.Color;


public class StraightLineChangePoints   {

  // The line `private Graphics g;` is declaring a private instance variable `g` of type `Graphics`.
  private Graphics g;

  // The `public StraightLinB(Graphics g)` is a constructor for the `StraightLinB` class. It takes a
  // `Graphics` object as a parameter and assigns it to the instance variable `g`. This allows the
  // `StraightLinB` object to have access to the `Graphics` object and use it to draw lines on a
  // graphical component.
  public StraightLineChangePoints(Graphics g) {
    this.g = g; 
  }


  public float getM(int x1, int y1, int x2, int y2) {
    if ((float)(y2 - y1) / (x2 - x1) > 1) {
      return (float)(x2 - x1) / (y2 - y1);
    } else {
      return (float)(y2 - y1) / (x2 - x1);
    }
  }

  public float getB(int x1, int y1, int x2, int y2) {
    if ((float)(y2 - y1) / (x2 - x1) > 1) {
      return x1 - getM(x1, y1, x2, y2) * y1;
    } else {
      return y1 - getM(x1, y1, x2, y2) * x1;
    }
  }


  public float getB(int x, int x1, int y1, int x2, int y2) {
    return getM(x1, y1, x2, y2) * x + getB(x1, y1, x2, y2);
  }

  public float getX(int y, int x1, int y1, int x2, int y2) {
    return (y - getB(x1, y1, x2, y2)) / getM(x1, y1, x2, y2);
  }

  public float getY(int x, int x1, int y1, int x2, int y2) {
    return getM(x1, y1, x2, y2) * x + getB(x1, y1, x2, y2);
  }

  

  

  private void drawIntermediatePoints (int x1, int y1, int x2, int y2, float m, float b) {
    // Draw intermediate points
    for(int x = x1; x <= x2; x++) {
    
        float y = getY(x, x1, y1, x2, y2);
        int roundedY = Math.round(y);
  
        // set color
        g.setColor(Color.PINK);
        // Draw point

        System.out.println("x: " + x + " y: " + roundedY);
        g.drawLine(x, roundedY, x, roundedY);
    }
  }
  /**
   * The function draws a line between two points by calculating the slope and y-intercept, and then
   * drawing intermediate points along the line.
   * 
   * @param x1 The x-coordinate of the starting point of the line.
   * @param y1 The y-coordinate of the starting point of the line.
   * @param x2 The x-coordinate of the end point of the line.
   * @param y2 The y-coordinate of the second point on the line.
   */
  public void drawLine(int x1, int y1, int x2, int y2) {
   
    // Calculate slope
    float m = getM(x1, y1, x2, y2);

    // Calculate y-intercept
    float b = getB(x1, y1, x2, y2);

    // Draw intermediate points
    drawIntermediatePoints (x1,y1, x2, y2, m, b);
  }
}