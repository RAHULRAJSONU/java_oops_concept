package exercise;

class Cast extends DownCast{
	public static void main(String[] args) {
		DownCast d=new Cast();
		check(d);		
	}
	
	public static void check(DownCast parm){
		if(parm instanceof Cast)
			((Cast)parm).doStuff();		
	}
	public void doStuff(){
		System.out.println("parm is Cast");
	}
}

