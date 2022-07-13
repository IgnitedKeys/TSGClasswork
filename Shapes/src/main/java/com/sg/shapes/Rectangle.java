package com.sg.shapes;

/**
 *
 * @author angeladrees
 */
public class Rectangle extends Shape {

    private double area;
    private double perimeter;

    private double length;
    private double width;

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

    //read-only
    @Override
    public double getArea() {
        area = length * width;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * length + 2 * width;
        return perimeter;
    }

}
