package io.github.ayechanaungthwin.design_patterns.creational.abstract_factory;

import io.github.ayechanaungthwin.design_patterns.creational.factory.Connection;

public class AbstractRdbmsFactory {

	private Connection connection;
	
	public AbstractRdbmsFactory(Connection connection) {
		this.connection = connection;
	}
	
	public Connection getDatabaseServer() {
		return connection;
	}
}
