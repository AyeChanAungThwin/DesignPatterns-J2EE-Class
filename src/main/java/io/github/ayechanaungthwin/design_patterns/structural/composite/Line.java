package io.github.ayechanaungthwin.design_patterns.structural.composite;

public class Line extends Point {

	private Point p2;
	
	public Line(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		if (p2==null) p2 = new Point(x, y);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Line is drawn at P1("+super.getX()+
				", "+super.getY()+") and "+
				"P2("+p2.getX()+
						", "+p2.getY()+").");
	}
	
}
