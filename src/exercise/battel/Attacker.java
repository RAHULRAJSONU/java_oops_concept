package exercise.battel;

import java.util.Random;

public class Attacker {
	public Weapon attack(){
		Random r=new Random();
		int res=r.nextInt(3);
		if(res==1){
			return new Arrow();
		}else if(res==2){
			return new Sword();
		}else{
			return null;
		}
	}
}
