import java.util.ArrayList;
import java.util.List;

public class Prism extends Circle{
    private List<Punto> points;

    public Prism(double radius, double centerX, double centerY) {
        super(radius, centerX, centerY);
    }
    public List<Punto> getPoints(int n) {
        this.points = new ArrayList<>();
        double angleStep = 2 * Math.PI / n;

        for (int i = 0; i < n; i++) {
            double angle = i * angleStep;
            double x = super.getCenterX() + super.getRadius() * Math.cos(angle);
            double y = super.getCenterY() + super.getRadius() * Math.sin(angle);
            // points.add(new double[]{x, y});

            points.add(new Punto((int) x, (int) y, 10));
        }

        return points;
    }
}
