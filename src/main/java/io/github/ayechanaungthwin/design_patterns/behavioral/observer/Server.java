package io.github.ayechanaungthwin.design_patterns.behavioral.observer;

public class Server {

	private Responder responder;
	
	public void attach(Responder responder) {
		this.responder = responder;
	}
	
	public void setMessage(String msg) {
		responder.message(msg);
	}
}
