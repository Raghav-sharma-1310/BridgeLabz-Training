package com.constructors.levelone;
import java.util.*;
public class Circle {
	double radius;
	
	public Circle() {
		this(1.0);
	}
    public Circle(double radius) {
    	this.radius = radius;
    }
    public void displayRadiusOfCircle() {
    	System.out.println("The radius of circle is " + radius);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle radii = new Circle();
        radii.displayRadiusOfCircle();
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        Circle radii2 = new Circle(radius);
        radii2.displayRadiusOfCircle();
	}

}
