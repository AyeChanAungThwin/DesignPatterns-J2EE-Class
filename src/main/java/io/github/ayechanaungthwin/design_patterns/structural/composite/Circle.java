package io.github.ayechanaungthwin.design_patterns.structural.composite;

import lombok.Getter;

public class Circle extends Point {

	@Getter
	private double radius;
	
	/*
	 * public Circle(int x, int y) { super(x, y); // TODO Auto-generated constructor
	 * stub }
	 */
	
	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle is drawn at P("+super.getX()+", "+super.getY()+")"
				+ " and radius = "+getRadius()+".");
	}

	
}
