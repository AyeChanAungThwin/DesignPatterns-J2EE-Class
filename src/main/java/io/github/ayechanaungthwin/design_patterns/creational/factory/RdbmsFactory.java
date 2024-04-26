package io.github.ayechanaungthwin.design_patterns.creational.factory;

public class RdbmsFactory {

	public Connection getDatabaseServer(Connector connector) {
		
		switch (connector) {
			case MySQL:
				return new MySQL();
			case MyOracle:
				return new MyOracle();
			default:
				return null;
		}
	}
}
