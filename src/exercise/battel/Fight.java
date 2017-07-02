package exercise.battel;

public class Fight {
	public static void main(String[] args) {
		System.out.println("App Started");
		Attacker at=new Attacker();
		Weapon w=at.attack();
		Defender df=new Defender();
		df.defend(w);
		System.out.println("App End");
	}
}
