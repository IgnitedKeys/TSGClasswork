package com.sg.shapes;

/**
 *
 * @author angeladrees
 */
public class Square extends Shape {

    private double area;
    private double perimeter;

    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //read-only
    @Override
    public double getArea() {
        area = length * length;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = 4 * length;
        return perimeter;
    }

}
