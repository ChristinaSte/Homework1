package hw7;

public abstract class Figure {

    private String name;
    private Point pointA;
    private Point pointB;

    public Figure(String name, Point pointA, Point pointB) {
        this.name = name;
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public abstract double areaOfFigure();

    public String getName() {
        return name;
    }

    public Point getPointA() {
        return pointA;
    }


    public Point getPointB() {
        return pointB;
    }

    public boolean isEqualAreaShapes(Figure otherFigure) {
        if (areaOfFigure( ) > otherFigure.areaOfFigure( )) {
            return true;
        } else if (areaOfFigure( ) < otherFigure.areaOfFigure( )) {
            return false;
        }

    }
}