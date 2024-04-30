package io.github.ayechanaungthwin.design_patterns.behavioral.cor;

public abstract class HandlerBase implements Handler {

	protected Handler handler;
	
	@Override
	public void setSuccessor(Handler handler) {
		// TODO Auto-generated method stub
		this.handler = handler;
	}
}
