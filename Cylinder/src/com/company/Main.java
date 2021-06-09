package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("Area of circle is " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55,7.25);
        System.out.println("Radius of cylinder is " + cylinder.getRadius());
        System.out.println("Area of cylinder bottom is " + cylinder.getArea());
        System.out.println("Height of cylinder is " + cylinder.getHeight());
        System.out.println("Volume of cylinder is " + cylinder.getVolume());
    }
}
