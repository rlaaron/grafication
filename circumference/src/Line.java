public class Line {
    private Point startPoint, endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Point getStartPoint() { return startPoint; }
    public Point getEndPoint() { return endPoint; }

    public void setStartPoint(Point startPoint) { this.startPoint = startPoint; }
    public void setEndPoint(Point endPoint) { this.endPoint = endPoint; }

    @Override
    public String toString() {
        return "Line{" +
                "startPoint=" + startPoint +
                ", endPoint=" + endPoint +
                '}';
    }
    
}
