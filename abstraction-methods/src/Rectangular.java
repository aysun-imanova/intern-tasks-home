public class Rectangular extends Figure {

    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangular(double width, double length) {
        if (width <= 0 || length <= 0) {
            throw new IllegalArgumentException("Düzbucaqlının eni və ya uzunu mənfi ola bilməz!");
        } else {
            this.width = width;
            this.length = length;
        }
    }

    @Override
    double calcArea() {
        return getLength() * getWidth();
    }
}
