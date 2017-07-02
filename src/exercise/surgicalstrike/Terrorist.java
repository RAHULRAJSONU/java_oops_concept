package exercise.surgicalstrike;

public class Terrorist {
	Weapon getKilled(){
		if(Math.random()>0.5 && Math.random()<0.8){
			return new Ak47();
		}else if(Math.random()<=0.5){
			return new Bomb();
		}else if(Math.random()>0.8){
			return new Knife();
		}else{
			return null;
		}
	}
}
