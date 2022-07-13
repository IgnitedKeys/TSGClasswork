package com.sg.shapes;

/**
 *
 * @author angeladrees
 */
public class Triangle extends Shape {

    private double area;
    private double perimeter;

    private double sideA;
    private double sideBase;
    private double sideC;
    private double height;

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideBase() {
        return sideBase;
    }

    public void setSideBase(double sideBase) {
        this.sideBase = sideBase;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //read-only
    @Override
    public double getArea() {
        area = (sideBase * height) / 2;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = sideA + sideBase + sideC;
        return perimeter;
    }

}
