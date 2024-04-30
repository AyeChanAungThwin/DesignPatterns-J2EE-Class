package io.github.ayechanaungthwin.design_patterns.behavioral.cor;

public interface Handler {

	void handleRequest(int value);
	void setSuccessor(Handler hander);
}
