package hw7;

public class Circle extends Figure {

    public Circle(Point pointA, Point pointB) {
        super("Круг", pointA, pointB);
    }


    @Override
    public double areaOfFigure() {
        return Math.PI * Math.pow(radiusOfCircle( ), 2);
    }

    public double radiusOfCircle() {
        return getPointA( ).distance(getPointB( ));
    }

    @Override
    public String toString() {
        return "Название фигуры:" + getName( ) + " Площадь фигуры:" + areaOfFigure( );
    }
}
