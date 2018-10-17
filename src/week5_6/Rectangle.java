package week5_6;

public class Rectangle extends Shape {//ke thua tu Shape
    private Point center;
    private double width;//khoi tao thuoc tinh
    private double length;



    public Rectangle(String color, boolean filled, Point center, double width, double length) {
        super(color, filled);
        this.center = center;//giữa
        this.width = width;//rộng
        this.length = length;//dài
    }

    public Rectangle(Point center, double width, double length) {
        this.center = center;
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return getWidth() * getLength();

    }

    public double getPerimeter() {
        return (getWidth() + getLength())*2 ;

    }
}