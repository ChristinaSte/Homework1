package hw7;

public class Rectangle extends Figure implements DiagonalOfRectangle {

    private Point pointC;

    public Rectangle(Point pointA, Point pointB, Point pointC) {
        super("Прямоугольник", pointA, pointB);
        this.pointC = pointC;
    }


    @Override
    public double diagonalOfRectangle() {
        return Math.sqrt(Math.pow(getPointA( ).distance(getPointB( )), 2) + Math.pow(getPointB( ).distance(getPointC( )), 2));
    }


    @Override
    public double areaOfFigure() {
        return getPointA( ).distance(getPointB( )) * getPointB( ).distance(getPointC( ));
    }

    public Point getPointC() {
        return pointC;
    }


    @Override
    public String toString() {
        return "Название фигуры:" + getName( ) + " Площадь фигуры:" + areaOfFigure( );

    }

}
