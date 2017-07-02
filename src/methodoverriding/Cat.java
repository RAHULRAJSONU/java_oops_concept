package methodoverriding;

public class Cat extends Animal {
	@Override
	void eat(){
		System.out.println("Cat eating");
	}
	@Override
	void makeNoise() {
		System.out.println("Cat making noise..");
	}
}
