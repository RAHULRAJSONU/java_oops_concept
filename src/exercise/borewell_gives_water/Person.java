package exercise.borewell_gives_water;

public class Person {

	public static void main(String[] args) {
		System.out.println("App Start.");
		BoreWell bw=new BoreWell();
		Water nbw=bw.pump();
		System.out.println("Value of water in Person Class ="+nbw);
		System.out.println("Type of Water provided by borewell= "+nbw.waterType);
		System.out.println("App End.");
	}

}
