public class Hyperbola {

    double x;
    double y;

    public void setX(double abscissa) {
        x = abscissa;
    }

    public void setY(double ordinate) {
        y = ordinate;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double calculate(double coordinate) {
        return 1 / coordinate;
    }

}
