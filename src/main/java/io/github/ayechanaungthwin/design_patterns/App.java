package io.github.ayechanaungthwin.design_patterns;

import java.util.List;

import io.github.ayechanaungthwin.design_patterns.creational.builder.Person;
import io.github.ayechanaungthwin.design_patterns.creational.factory.Connection;
import io.github.ayechanaungthwin.design_patterns.creational.factory.Connector;
import io.github.ayechanaungthwin.design_patterns.creational.factory.MyOracle;
import io.github.ayechanaungthwin.design_patterns.creational.factory.MySQL;
import io.github.ayechanaungthwin.design_patterns.creational.factory.RdbmsFactory;
import io.github.ayechanaungthwin.design_patterns.creational.singleton.Singleton;

public class App {
	
    public static void main( String[] args ) {
        //Singleton();
    	//Factory();
    	//AbstractFactory();
    	//Builder();
    }
    
    public static void Singleton() {
    	Singleton.getInstance();
    	Singleton.getInstance();
    	Singleton.getInstance();
    }
    
    public static void Factory() {
    	Singleton dependencyRegistry = Singleton.getInstance();
    	
    	RdbmsFactory factory = dependencyRegistry.getRdbmsFactory();
    	Connection mySQL = factory.getDatabaseServer(Connector.MySQL);
    	Connection myOracle = factory.getDatabaseServer(Connector.MyOracle);
    	
    	List<Connection> connections = List.of(mySQL, myOracle);
    	
    	for (Connection out: connections) {
    		out.connect();
    	}
    }
    
    public static void AbstractFactory() {
    	Singleton dependencyRegistry = Singleton.getInstance();
    	Singleton.getInstance();
    	
    	Connection mySQL = dependencyRegistry.getAbstractRdbmsFactory(new MySQL()).getDatabaseServer();
    	Connection myOracle = dependencyRegistry.getAbstractRdbmsFactory(new MyOracle()).getDatabaseServer();
    	
    	List<Connection> connections = List.of(mySQL, myOracle);
    	
    	for (Connection out: connections) {
    		out.connect();
    	}
    }
    
    public static void Builder() {
    	Person prn = new Person.PersonBuilder("Aye Chan", 30)
    			.setHasNRC(true)
    			.setHasPassport(false)
    			.build();
    	
    	System.out.println(prn.toString());
    }
}
