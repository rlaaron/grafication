import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;

//METODO DE TRAZADO RAPIDO DE LA ELIPSE
public class App5 extends Frame {
    
    public App5() {
        setTitle("Trazado de elipse");
        this.setSize(1000, 1000);
        this.setVisible(true);
    }
    
    @Override
    
    public void paint(Graphics g) {
        g.setColor(Color.ORANGE);
    

    int sx, sy;
    double f;
    int x=0,y1=0,x1=0,n,x2,y;
    double rc,yc,aux;
    int centrox, centroy;

    // Radios de la elipse:
    sx = 10;
    sy = 5;
    f = sy/sx;
    n = 4;

    // Centro de la elipse:
    centrox = 400;
    centroy = 400;
    
    // Trazado de la elipse:
     rc = (sy*sy)/2;

    x= (int) Math.sqrt(rc);

    x2 = x/n;
    yc = sy*sy-x2*x2;
    aux = Math.sqrt(yc);
    aux = Math.round(aux);
    y =(int) (aux * f);
  
    //PUNTOS DIBUJADOS

    // PRIMER PUNTO
    g.drawLine(x1+centrox, y1+centroy, x2+centrox, y+centroy); 
    g.drawLine(x2+centrox, y+centroy, x+centrox, x+centroy);

    // SEGUNDO PUNTO
    g.drawLine(y1+centrox, x1+centroy, y+centrox, x2+centroy);
    g.drawLine(y+centrox, x2+centroy, x+centrox, x+centroy);

    // TERCER PUNTO
    g.drawLine(-y1+centrox, x1+centroy, -y+centrox, x2+centroy);
    g.drawLine(-y+centrox, x2+centroy, -x+centrox, x+centroy);

    // CUARTO PUNTO
    g.drawLine(-y1+centrox, -x1+centroy, -y+centrox, -x2+centroy);
    g.drawLine(-y+centrox, -x2+centroy, -x+centrox, -x+centroy);

    // QUINTO PUNTO
    g.drawLine(centrox-x1, centroy-y1, centrox-x2, centroy-y);
    g.drawLine(centrox-x2, centroy-y, centrox-x, centroy-x);

    // SEXTO PUNTO
    g.drawLine(centrox+y1, centroy-x1, centrox+y, centroy-x2);
    g.drawLine(centrox+y, centroy-x2, centrox+x, centroy-x);

    // SEPTIMO PUNTO
    g.drawLine(-x1+centroy, y1+centroy, -x2+centrox, y+centroy);
    g.drawLine(-x2+centroy, y+centroy, -x+centrox, x+centroy);

    // OCTAVO PUNTO
    g.drawLine(x1+centroy, -y1+centroy, x2+centrox, -y+centroy);
    g.drawLine(x2+centroy, -y+centroy, x+centrox, -x+centroy);

    }
        public static void main(String[] args) {
            App5 p = new App5();

        }
}