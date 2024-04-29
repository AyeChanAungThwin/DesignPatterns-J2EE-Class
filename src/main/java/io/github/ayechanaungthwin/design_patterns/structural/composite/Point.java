package io.github.ayechanaungthwin.design_patterns.structural.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Point implements Graphics {
	
	@Getter
	private int x, y;
	
	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Point is drawn at : ("+x+", "+y+").");
	}

	
}
