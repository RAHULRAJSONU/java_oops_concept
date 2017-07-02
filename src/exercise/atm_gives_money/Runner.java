package exercise.atm_gives_money;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm a=new Atm();
		System.out.println("App Starts.");
		Object[] ob=a.withdrawl();
		for(Object a1:ob){
			//System.out.println(a1);
			if(a1 instanceof Money){
				((Money) a1).ammount=2000;
				System.out.println(" Ammount given-: "+((Money) a1).ammount);
			}
		}
		/*a.giveMoney();
		System.out.println("Money Given.");
		a.giveReceipt();*/
		System.out.println("App End.");
		

	}

}
