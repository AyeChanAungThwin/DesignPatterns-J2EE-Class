package io.github.ayechanaungthwin.design_patterns.behavioral.cor;

public class RedBullHandler extends HandlerBase {

	@Override
	public void handleRequest(int value) {
		// TODO Auto-generated method stub
		if (value>=1500) {
			System.out.println("You can buy redbull!");
		}
		else {
			handler.handleRequest(value);
		}
	}

}
