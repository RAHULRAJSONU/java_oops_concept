package exercise.payment;

import java.util.Scanner;

public class Website {

	public void onlinePurchase(){
		IPaymentGateWay pmt=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Payment Choice [Paypal | Citrix]");
		String payMode=sc.nextLine();
		if(payMode.equalsIgnoreCase("paypal")){
			pmt=new PayPalImpl();
		}else if(payMode.equalsIgnoreCase("citrix")){
			pmt=new CitrixImpl();
		}		
		if(pmt !=null){
			pmt.PayMoney();
		}else{
			System.out.println("Enter Right Choice");
		}
		sc.close();
	}

}
