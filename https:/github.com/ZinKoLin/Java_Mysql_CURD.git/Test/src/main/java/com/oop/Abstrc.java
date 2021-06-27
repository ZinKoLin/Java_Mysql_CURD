package com.oop;


abstract class Shape {
	
	abstract void showShape();
	
}

class Rectangle extends Shape{

	@Override
	void showShape() {
		System.out.println("this is rectangle");
		
	}
}

class Circle extends Shape{

	@Override
	void showShape() {
		System.out.println("This is Circle");
		
	}
}

public class Abstrc{
	public static void main(String[] args) {
		
		Shape obj = new Rectangle();
		obj.showShape();
		
		Shape obj1 = new Circle();
		obj1.showShape();
	}
		
	}

	

