class LineaRecta {
    Point startPoint, endPoint;
    double m, b;

    public LineaRecta(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        calculateCoefficients();
    }

    private void calculateCoefficients() {
        m = (endPoint.y - startPoint.y) / (endPoint.x - startPoint.x);
        b = startPoint.y - m * startPoint.x;
    }

    public double functionValue(double x, double y) {
        return y - m * x - b;
    }

    public boolean isPointOnLine(double x, double y) {
        return functionValue(x, y) == 0;
    }

    public boolean isPointAboveLine(double x, double y) {
        return functionValue(x, y) < 0;
    }

    public boolean isPointBelowLine(double x, double y) {
        return functionValue(x, y) > 0;
    }
}




