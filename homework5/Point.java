package homework5;

public class Point {
    private int x;


    public int getX() {
        return x;
    }

    private int y;


    public int getY() {
        return y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public double distance(Point a, Point b) {
        return Math.sqrt((b.x - a.x) * (b.x - a.x) + (b.y - a.y) * (b.y - a.y));
    }
}
