package homework5;

public class PointDemo {
    public static void main(String[] args) {
        Point a = new Point(10, 5);
        Point b = new Point(18, 26);
        Rectangle d = new Rectangle(new Point(1, 1), new Point(3, 4));

        System.out.println("точка имеет координаты X=" + a.getX() + " и Y=" + a.getY());
        System.out.println("Расстояние: " + a.distance(a, b));
        System.out.println(" диагональ прямоугольника =" + d.diagonal());

    }
}

