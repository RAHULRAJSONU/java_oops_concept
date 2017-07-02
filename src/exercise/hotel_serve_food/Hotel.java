package exercise.hotel_serve_food;

import java.util.Scanner;

public class Hotel {
	String name="MTR";
	public void processOrder(){
		Food f=order();
		serve(f);
	}
	private  Food order(){
		Scanner sc=new Scanner(System.in);
		System.out.println("What do you like to have: Idly|SambharWada|IceCream");
		String item=sc.nextLine();
		if(item.equalsIgnoreCase("SambharBada")){
			System.out.println("Please enter quantity..");
			int qty=sc.nextInt();
			SambharBada sb=new SambharBada("SambharWada", qty);
			sc.close();
			return sb;
		}else if(item.equalsIgnoreCase("idly")){
			System.out.println("Please enter quantity..");
			int qty=sc.nextInt();
			Idly id=new Idly("Idly", qty);
			sc.close();
			return id;
		}else if(item.equalsIgnoreCase("IceCream")){
			System.out.println("Please enter quantity..");
			int qty=sc.nextInt();
			IceCream ic=new IceCream("IceCream", qty);
			sc.close();
			return ic;
		}else{
			sc.close();
			return null;			
		}
		
		
	}
	private void serve(Food f){		
		if(f instanceof IceCream){
			IceCream ic=(IceCream)f;
			System.out.println("Your food is ready: ");
			System.out.println("Item : "+ic.foodName);
			System.out.println("Quantity: "+ic.qnty);
			System.out.println("Price: "+ic.qnty*ic.price);
		}else if(f instanceof SambharBada){
			SambharBada sb=(SambharBada)f;
			System.out.println("Your food is ready: ");
			System.out.println("Item : "+sb.foodName);
			System.out.println("Quantity: "+sb.qnty);
			System.out.println("Price: "+sb.qnty*sb.price);
		}else if(f instanceof Idly){
			Idly id=(Idly)f;
			System.out.println("Your food is ready: ");
			System.out.println("Item : "+id.foodName);
			System.out.println("Quantity: "+id.qnty);
			System.out.println("Price: "+id.qnty*id.price);
		}else{
			System.out.println("Sorry! item not available..");
		}
	}
}
