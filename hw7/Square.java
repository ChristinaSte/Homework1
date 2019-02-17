package hw7;

public class Square extends Quadrangle {

    public Square(Point pointA, Point pointB, Point pointC) {
        super("Квадрат", pointA, pointB);
    }


    @Override
    public double areaOfFigure() {
        return lengthOfSideOfFigure( ) * lengthOfSideOfFigure( );
    }

    public double lengthOfSideOfFigure() {
        return getPointA( ).distance(getPointB( ));
    }

    @Override
    public String toString() {
        return "Название фигуры:" + getName( ) + " Площадь фигуры:" + +areaOfFigure( );

    }
}
