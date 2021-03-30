package com.class11;

public class Shape {

	private double volume;

	public Shape(double volume) {
		this.volume = volume;
	}

	public double getVolume() {
		return volume;
	}

}

class SolidRevolution extends Shape {

	private double radius;

	public SolidRevolution(double radius, double volume) {
		super(volume);
		this.radius = radius;

	}

	public double getRadius() {
		return radius;
	}
}

class Cylinder extends SolidRevolution {

	private double height;

	public Cylinder(double radius, double height) {
		super(radius, height);
		this.height = height;
		super.getVolume();
	}
	public double getHeight() {
		return height;
	}

}

class Ball extends SolidRevolution {

	public Ball(double radius, double volume) {
		super(radius, volume);

	}
}

class Pyramid extends Shape {

	private double s;
	private double h;

	public Pyramid(double s, double h) {
		super(h * s);
		this.h = h;
		this.s = s;
	}
	public double getS() {
		return s;
	}
public double getH() {
	return h;
}
}
class Box extends Shape{
	
	private double box;
	private boolean shape;
	public Box(double box,boolean shape ) {
		super(box);
		this.box = box;
		this.shape = shape;
	}
	public double getBox() {
		return box;
	}
	public boolean getShape() {
		return shape;
	}
}






