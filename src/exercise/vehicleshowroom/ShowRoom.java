package exercise.vehicleshowroom;

import java.util.Scanner;

public class ShowRoom {
	void Buy(){
		Vehicle v=order();
		sell(v);
	}
	private Vehicle order(){
		System.out.println("Enter the vehicle : AutoRikshaw|Bike");
		Scanner sc=new Scanner(System.in);
		String vn=sc.nextLine();
		sc.close();
		if(vn.equalsIgnoreCase("bike")){
			Bike b=new Bike();
			return b;
	    }else if(vn.equalsIgnoreCase("Autorikshaw")){
	    	AutoRikshaw ar=new AutoRikshaw();
	    	return ar;
	    }else{
	    	System.out.println("Enter right choice");
	    	return null;
	    }
	}
	
	private void sell(Vehicle v){
		if(v instanceof Bike){
			Bike b=(Bike)v;
			b.kickStart();
		}else if(v instanceof AutoRikshaw){
			AutoRikshaw ar=(AutoRikshaw)v;
			ar.pullStart();
		}
		else{
			System.out.println("You baught nothing");
		}
	}
}
