package io.github.ayechanaungthwin.design_patterns;

import java.util.List;
import java.util.Queue;
import java.util.Stack;

import io.github.ayechanaungthwin.design_patterns.behavioral.cor.CannotBuyHandler;
import io.github.ayechanaungthwin.design_patterns.behavioral.cor.Handler;
import io.github.ayechanaungthwin.design_patterns.behavioral.cor.RedBullHandler;
import io.github.ayechanaungthwin.design_patterns.behavioral.cor.WaterHandler;
import io.github.ayechanaungthwin.design_patterns.behavioral.cor.WineHandler;
import io.github.ayechanaungthwin.design_patterns.behavioral.observer.Client;
import io.github.ayechanaungthwin.design_patterns.behavioral.observer.Server;
import io.github.ayechanaungthwin.design_patterns.creational.builder.Person;
import io.github.ayechanaungthwin.design_patterns.creational.factory.Connection;
import io.github.ayechanaungthwin.design_patterns.creational.factory.Connector;
import io.github.ayechanaungthwin.design_patterns.creational.factory.ModernDatabaseServer;
import io.github.ayechanaungthwin.design_patterns.creational.factory.MyOracle;
import io.github.ayechanaungthwin.design_patterns.creational.factory.MySQL;
import io.github.ayechanaungthwin.design_patterns.creational.factory.RdbmsFactory;
import io.github.ayechanaungthwin.design_patterns.creational.singleton.Singleton;
import io.github.ayechanaungthwin.design_patterns.structural.composite.Circle;
import io.github.ayechanaungthwin.design_patterns.structural.composite.Graphics;
import io.github.ayechanaungthwin.design_patterns.structural.composite.Line;
import io.github.ayechanaungthwin.design_patterns.structural.composite.Point;
import io.github.ayechanaungthwin.design_patterns.structural.decorator.BasicLogger;
import io.github.ayechanaungthwin.design_patterns.structural.decorator.DateTimeLogger;
import io.github.ayechanaungthwin.design_patterns.structural.decorator.HtmlLogger;
import io.github.ayechanaungthwin.design_patterns.structural.decorator.Logger;
import io.github.ayechanaungthwin.design_patterns.structural.facade.Circle1;
import io.github.ayechanaungthwin.design_patterns.structural.facade.FacadeDp;
import io.github.ayechanaungthwin.design_patterns.structural.facade.Rectangle;
import io.github.ayechanaungthwin.design_patterns.structural.flyweight.Player;
import io.github.ayechanaungthwin.design_patterns.structural.flyweight.PlayerFactory;
import io.github.ayechanaungthwin.design_patterns.structural.flyweight.PlayerType;
import io.github.ayechanaungthwin.design_patterns.structural.flyweight.Weapon;
import io.github.ayechanaungthwin.design_patterns.structural.proxy.ImageLoader;
import io.github.ayechanaungthwin.design_patterns.structural.proxy.ProxyImageLoaderImpl;

public class App {
	
    public static void main( String[] args ) {
        //Singleton();
    	//Factory();
    	//AbstractFactory();
    	//Builder();
    	//Adapter();
    	//Composite();
    	//Proxy();
    	//FlyWeight();
    	//COR();
    	//Facade();
    	//Decorator();
    	//Observer();
    	//https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
    	Stack<Integer> stack = new Stack<>();
    	stack.add(1);
    	stack.add(2);
    	stack.add(3);
    	
    	System.out.println(stack.peek());
    	System.out.println(stack.peek());
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
    
    public static void Adapter() {
    	Singleton dependencyRegistry = Singleton.getInstance();
    	Singleton.getInstance();
    	
    	Connection mySQL = dependencyRegistry.getAbstractRdbmsFactory(new MySQL()).getDatabaseServer();
    	Connection myOracle = dependencyRegistry.getAbstractRdbmsFactory(new MyOracle()).getDatabaseServer();
    	Connection modernDatabaseServer = dependencyRegistry.getConnection(new ModernDatabaseServer());
    	
    	List<Connection> connections = List.of(mySQL, myOracle, modernDatabaseServer);
    	
    	for (Connection out: connections) {
    		out.connect();
    	}
    }
    
    public static void Composite() {
    	Point point = new Point(5, 5);
    	
    	Line line = new Line(0, 0);
    	line.move(1, 1);
    	
    	Circle circle = new Circle(1, 1, 5.3);
    	
    	List<Graphics> graphics = List.of(point, line, circle);
    	
    	for (Graphics out: graphics) {
    		out.draw();
    	}
    }
    
    public static void Proxy() {
		/*
		 * String path = "C:\\Users\\User\\Desktop\\image.jpg";
		 * 
		 * ImageLoader img1 = new ImageLoaderImpl(path); ImageLoader img2 = new
		 * ImageLoaderImpl(path);
		 * 
		 * List<ImageLoader> imgs = List.of(img1, img2);
		 * 
		 * for(ImageLoader out: imgs) { out.load(); }
		 */
    	
    	String path = "C:\\Users\\User\\Desktop\\image1.jpg";
    	ImageLoader img1 = new ProxyImageLoaderImpl(path);
    	ImageLoader img2 = new ProxyImageLoaderImpl(path);
    	
    	List<ImageLoader> imgs = List.of(img1, img2);
    	
    	for(ImageLoader out: imgs) {
    		out.load(); 
    	}
    }
    
    public static void FlyWeight() {
    	Player player1 = PlayerFactory.getPlayer(PlayerType.Terrorist);
    	player1.assignWeapon(Weapon.Knife);
    	//player1.mission();
    	
    	Player player2 = PlayerFactory.getPlayer(PlayerType.CounterTerrorist);
    	player2.assignWeapon(Weapon.Pistol);
    	//player2.mission();
    	
    	Player player3 = PlayerFactory.getPlayer(PlayerType.CounterTerrorist);
    	player3.assignWeapon(Weapon.MachineGun);
    	//player3.mission();
    	
    	Player player4 = PlayerFactory.getPlayer(PlayerType.Terrorist);
    	player4.assignWeapon(Weapon.Pistol);
    	//player4.mission();
    	
    	List<Player> players = List.of(player1, player2, player3, player4);
    	
    	for(Player out: players) {
    		out.mission();
    	}
    }
    
    public static void COR() {
    	//if-else if-else
    	Handler hdl1 = new WineHandler();
    	Handler hdl2 = new RedBullHandler();
    	Handler hdl3 = new WaterHandler();
    	Handler hdl4 = new CannotBuyHandler();
    	
    	hdl1.setSuccessor(hdl2);
    	hdl2.setSuccessor(hdl3);
    	hdl3.setSuccessor(hdl4);
    	
    	int money = 200;
    	hdl1.handleRequest(money);
    }
    
    public static void Facade() {
    	//Program to interface, not implementation
    	FacadeDp facade = new FacadeDp(new Circle1(), new Rectangle());
    	facade.draw();
    }
    
    public static void Decorator() {
    	Logger basicLogger = new BasicLogger();
    	System.out.println(basicLogger.log());
    	
    	Logger dateTimeLogger = new DateTimeLogger(basicLogger);
    	System.out.println(dateTimeLogger.log());
    	
    	Logger htmlLogger = new HtmlLogger(dateTimeLogger);
    	System.out.println(htmlLogger.log());
    }
    
    public static void Observer() {
    	Client client = new Client();
    	client.uploadImage();
    	
    	Server server = new Server();
    	server.attach(client);
    	server.setMessage("Image is uploaded successfully.");
    }
}
