package io.github.ayechanaungthwin.design_patterns.behavioral.cor;

public class WaterHandler extends HandlerBase {

	@Override
	public void handleRequest(int value) {
		// TODO Auto-generated method stub
		if (value>=500) {
			System.out.println("You can buy water!");
		}
		else {
			handler.handleRequest(value);
		}
	}

}
