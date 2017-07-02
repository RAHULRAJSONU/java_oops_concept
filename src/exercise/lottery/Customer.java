package exercise.lottery;

public class Customer {
	public static void main(String[] args) {
		System.out.println("App started");
		LotteryShop ls=new LotteryShop();
		ls.processTicket();
		System.out.println("App end");
	}
}
