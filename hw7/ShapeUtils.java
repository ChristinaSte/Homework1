package hw7;

public class ShapeUtils {


    public static boolean isRectangle(Figure someFigure) {
        boolean figureRectangle = someFigure instanceof Rectangle ? true : false;
    }

    public static boolean isTriagle(Figure someFigure) {
        boolean figureTriangle = someFigure instanceof Triangle ? true : false;
    }
}
