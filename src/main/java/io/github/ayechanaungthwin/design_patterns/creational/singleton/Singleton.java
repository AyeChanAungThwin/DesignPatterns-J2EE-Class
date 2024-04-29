package io.github.ayechanaungthwin.design_patterns.creational.singleton;

import io.github.ayechanaungthwin.design_patterns.creational.abstract_factory.AbstractRdbmsFactory;
import io.github.ayechanaungthwin.design_patterns.creational.factory.Connection;
import io.github.ayechanaungthwin.design_patterns.creational.factory.ModernDatabaseServer;
import io.github.ayechanaungthwin.design_patterns.creational.factory.RdbmsFactory;
import io.github.ayechanaungthwin.design_patterns.structural.adapter.DatabaseAdapter;

public class Singleton {

	private static Singleton instance;
	
	private Singleton() {
		System.out.println("Created object!");
	}
	
	public static Singleton getInstance() {
		if (instance==null) {
			synchronized (Singleton.class) {
				instance = new Singleton();
			}
		}
		return instance;
	}
	
	public RdbmsFactory getRdbmsFactory() {
		return new RdbmsFactory();
	}
	
	public AbstractRdbmsFactory getAbstractRdbmsFactory(Connection connection) {
		return new AbstractRdbmsFactory(connection);
	}
	
	public Connection getConnection(ModernDatabaseServer modernDatabaseServer) {
		return new DatabaseAdapter(modernDatabaseServer);
	}
}
