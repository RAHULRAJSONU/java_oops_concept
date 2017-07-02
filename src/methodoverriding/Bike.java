package methodoverriding;

public class Bike extends Vehicle {
	@Override
	void start() {
		System.out.println("Overriden method called..");
		System.out.println("Bike Started..");
	}
}
