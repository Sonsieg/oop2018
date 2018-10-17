package week5_6;


public class Circle extends Shape {
    final double PI = 3.14;
    private double radius;//ban kinh
    private Point center;//tam cua duong tron
    public Circle() {

    }

    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }


    public Circle(String color, boolean filled, double radius, Point center) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }


    public double getArea() {//tinh dien tich
        return PI * getRadius() * getRadius();


    }

    public double getPerimeter() {//tinh chu vi hinh tron
        return 2 * PI * getRadius();

    }
}