package exercise.vegitable;

import java.util.Scanner;

public class Shop {
	public void processOrder(){
		Veg v=order();
		sell(v);
	}
	
	private Veg order(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your product: Chilly|Potato|Carrot");
		String vegName = sc.nextLine();
		sc.close();
		if(vegName.equalsIgnoreCase("chilly")){
			Chilly ch=new Chilly();
			return ch;
		}else if(vegName.equalsIgnoreCase("potato")){
			Potato pt=new Potato();
			return pt;
		}else if(vegName.equalsIgnoreCase("carrot")){
			Carrot ct=new Carrot();
			return ct;
		}else{
			return null;
		}			
	}
	
	private void sell(Veg value){
		if(value instanceof Potato){
			Potato p=(Potato) value;
			p.prepareChips();
		}else if(value instanceof Chilly){
			Chilly ch=(Chilly)value;
			ch.prepareBajji();
		}else if(value instanceof Carrot){
			Carrot ct=(Carrot)value;
			ct.prepareHalwa();
		}else{
			System.out.println("You selected nothing...");
		}

	}
	
}
