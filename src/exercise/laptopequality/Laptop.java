package exercise.laptopequality;

public class Laptop {

String model;
Double price;

public Laptop(){
	
}

public Laptop(String model, Double price) {
	this.model = model;
	this.price = price;
}


@Override
	public boolean equals(Object obj) {
		boolean isSame=false;
		if(obj instanceof Laptop){
			Laptop hp=(Laptop)obj;
			if(this.model.equalsIgnoreCase(hp.model)){
				isSame=true;
			}
		}
		return isSame;
	}
}
