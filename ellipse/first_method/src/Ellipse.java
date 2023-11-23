import java.util.ArrayList;

public class Ellipse {
    private int sy, sx;
    private ArrayList<Point> pointsToDraw;
    

    public Ellipse(int sy, int sx) {
        this.sy = sy;
        this.sx = sx;
    }

    public int getSx() { return this.sx; }
    public int getSy() { return this.sy; }

    public void setSx(int sx) { this.sx = sx; }
    public void setSy(int sy) { this.sy = sy; }

    public void calculatePoints (int x){

    }
}
