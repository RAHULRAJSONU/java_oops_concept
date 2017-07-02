package exercise.lottery;

import java.util.Random;

public class LotteryShop {
	public void processTicket(){
		Vehicle v=isLuckey();
		result(v);
	}

	private void result(Vehicle v) {
		if(v instanceof Audi){
			((Audi)v).driveAudi();
		}else if(v instanceof HarleyDavidson){
			((HarleyDavidson)v).ride();;
		}else if(v instanceof Bicycle){
			((Bicycle)v).paddel();;
		}else{
			System.out.println("Sorry you are not luckey this time...try for next.");
		}
	}

	private Vehicle isLuckey() {
		Random r=new Random();
		int number=r.nextInt(4);
		if(number==3){
			return new Audi();
		}else if(number==2){
			return new HarleyDavidson();
		}else if(number==1){
			return new Bicycle();
		}
		return null;
	}
}
