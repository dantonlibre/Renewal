package com.class11;

public class ShapeTest {
	public static void main(String[] args) {

	Shape shape = new Shape(3.2);
	SolidRevolution sol =new SolidRevolution(1.5, 3.3) ;
	Cylinder cylinder = new Cylinder(1.9, 17.1);
	Ball ball = new Ball(5.6, 16.6);
	Pyramid pyramid = new Pyramid(2.4, 7.6);
	Box box = new Box(9.8, false);
	
	System.out.println(shape.getVolume());
	System.out.println(sol.getRadius()+", "+ sol.getVolume());
	System.out.println(cylinder.getHeight()+ cylinder.getRadius());	
	
	System.out.println(ball.getRadius()+ ball.getVolume());
	System.out.println(pyramid.getS() * pyramid.getH());
	System.out.println(box.getBox() + "shape = " + box.getShape());
		
	}
	}


