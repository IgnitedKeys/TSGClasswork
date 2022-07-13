
package com.sg.shapes;

/**
 *
 * @author angeladrees
 */
public class Circle extends Shape{
     private double area;
    private double perimeter;
    private double radius;
    
    public static final double PI = 3.14159265358979323846;

    
    //read-only
    @Override
    public double getArea() {
        area = PI * (radius * radius);
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * PI * radius;
        return perimeter;
    }
    
}
