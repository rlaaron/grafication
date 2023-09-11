class LineaRecta {
    private Point startPoint, endPoint;
    private double m, b; //m = slope, b = ordinate to origin

    public LineaRecta(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        calculateCoefficients();
    }

    public double getSlope() { return m; }

    public double getOrdinateToOrigin() { return b; }

    public Point getStartPoint() { return startPoint; }

    public Point getEndPoint() { return endPoint; }

    private void calculateM() {
        this.m = (endPoint.getY() - startPoint.getY()) / (endPoint.getX() - startPoint.getX());
    }

    private void calculateB() {
        this.b = startPoint.getY() - m * startPoint.getX();
    }

    private void calculateCoefficients() {
        calculateM();
        calculateB();
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




