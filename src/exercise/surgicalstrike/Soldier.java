package exercise.surgicalstrike;

public class Soldier {
	void kill(){
		System.out.println("Indian Soldier Attacked terrorist");
		Terrorist t=new Terrorist();
		Weapon w=t.getKilled();
		if(w instanceof Ak47){
			((Ak47)w).shoot();
		}else if(w instanceof Bomb){
			((Bomb)w).blast();
		}else if(w instanceof Knife){
			((Knife)w).stab();
		}else{
			System.out.println("Terrorist runaway");
		}
	}

	
}
