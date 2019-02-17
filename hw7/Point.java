package hw7;

public class Point {

    private int pointX;
    private int pointY;

    public Point(int pointX, int pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(pointX - point.getPointX( ), 2) + Math.pow(pointY - point.getPointY( ), 2));
    }

    public int getPointX() {
        return pointX;
    }

    public int getPointY() {
        return pointY;
    }

}