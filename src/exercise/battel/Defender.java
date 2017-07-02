package exercise.battel;

public class Defender {
	
	public void defend(Weapon w){
		if(w instanceof Arrow){
			((Arrow)w).defendArrow();
		}else if(w instanceof Sword){
			((Sword)w).defendSword();
		}else{
			System.out.println("nothing to defend..");
		}
	}
}
