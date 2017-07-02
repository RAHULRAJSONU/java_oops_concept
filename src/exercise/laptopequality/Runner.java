package exercise.laptopequality;

public class Runner {

	public static void main(String[] args) {
		Laptop h=new Laptop("HP", 45820.50);
		Laptop h1=new Laptop("LENOVO", 78024.00);
		System.out.println(h.equals(h1));
	}

}
