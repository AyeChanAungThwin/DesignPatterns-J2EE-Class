package io.github.ayechanaungthwin.design_patterns.structural.facade;

public class FacadeDp implements Shape {

	private Shape[] shapes;
	
	public FacadeDp(Shape... shapes) {
		this.shapes = shapes;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		for (Shape out: this.shapes) {
			out.draw();
		}
	}
	
	
}
