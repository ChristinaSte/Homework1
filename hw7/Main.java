package hw7;

public class Main {

    public static void main(String[] args) {
        Point pointA = new Point(1, 1);
        Point pointB = new Point(5, 4);
        Point pointC = new Point(2, 7);
        Point pointD = new Point(3, 8);

        Square square = new Square(pointA, pointB);
        Rectangle rectangle = new Rectangle(pointA, pointB, pointC);


        System.out.println(square.toString( ));
        System.out.println(rectangle.toString( ));

        square.isEqualAreaShapes(rectangle);

        ShapeUtils.whatIsFigure(square);

    }
}
