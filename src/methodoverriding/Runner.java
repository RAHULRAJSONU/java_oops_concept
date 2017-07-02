package methodoverriding;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Bike object created");
		Bike b= new Bike();
		b.start();
		System.out.println("Cat object created");
		Cat c=new Cat();
		c.eat();
		c.makeNoise();
		
	}

}
