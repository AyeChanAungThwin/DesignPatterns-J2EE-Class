package io.github.ayechanaungthwin.design_patterns.structural.adapter;

import io.github.ayechanaungthwin.design_patterns.creational.factory.Connection;
import io.github.ayechanaungthwin.design_patterns.creational.factory.ModernDatabaseServer;
import lombok.Getter;

public class DatabaseAdapter implements Connection {

	@Getter
	private ModernDatabaseServer modernDatabaseServer;
	
	public DatabaseAdapter(ModernDatabaseServer modernDatabaseServer) {
		this.modernDatabaseServer = modernDatabaseServer;
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		modernDatabaseServer.connectToDatabase();
	}
}
