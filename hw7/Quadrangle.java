package hw7;

public abstract class Quadrangle extends Figure {

    public Quadrangle(String name, Point pointA, Point pointB) {
        super(name, pointA, pointB);
    }

    public abstract double areaOfFigure();

}
