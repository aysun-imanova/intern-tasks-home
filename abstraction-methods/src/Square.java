public class Square extends Figure {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Kvadratın tərəfi mənfi ola bilməz!");
        } else {
            this.side = side;
        }
    }

    @Override
    double calcArea() {
        return getSide() * getSide();
    }
}
