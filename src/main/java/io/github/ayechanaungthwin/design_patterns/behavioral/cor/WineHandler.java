package io.github.ayechanaungthwin.design_patterns.behavioral.cor;

public class WineHandler extends HandlerBase {

	@Override
	public void handleRequest(int value) {
		// TODO Auto-generated method stub
		if (value>=4700) {
			System.out.println("You can buy wine!");
		}
		else {
			handler.handleRequest(value);
		}
	}

}
