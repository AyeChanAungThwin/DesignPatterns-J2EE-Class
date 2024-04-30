package io.github.ayechanaungthwin.design_patterns.behavioral.observer;

public class Client implements Responder {

	public void uploadImage() {
		System.out.println("Image is uploading!");
	}

	@Override
	public void message(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Client's : "+msg);
	}
	
}
