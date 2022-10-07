
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpacedLogger object = new SpacedLogger();
		System.out.println("Spaced Logger: log () ");
		object.log("Hello");
		object.log("ate");
		
		System.out.println(" \nSpacedLogger: error () ");
		object.error("Hello");
		object.error("ate");
		
		
		AsteriskLogger object2 = new AsteriskLogger();
		System.out.println(" \n\nAstrisk Logger: log () ");
		object2.log("Hello");
		
		System.out.println(" \nAstrisk Logger: error () ");
		object2.error("Hello");
	}

}
