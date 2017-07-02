package exercise.atm_gives_money;

public class Atm {
	Object[] withdrawl(){
		Money m=new Money();
		Receipt r=new Receipt();
		Object[] arr=new Object[2];
		arr[0]=m;
		arr[1]=r;
		return arr;
	}
	
	
}
