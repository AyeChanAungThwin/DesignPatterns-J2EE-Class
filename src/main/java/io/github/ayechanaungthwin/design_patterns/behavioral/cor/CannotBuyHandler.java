package io.github.ayechanaungthwin.design_patterns.behavioral.cor;

public class CannotBuyHandler extends HandlerBase {

	@Override
	public void handleRequest(int value) {
		// TODO Auto-generated method stub
		if (value<500) {
			System.out.println("You cannot buy anything!");
		}
		else {
			handler.handleRequest(value);
		}
	}

}
