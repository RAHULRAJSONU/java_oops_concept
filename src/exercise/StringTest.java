package exercise;

public class StringTest {
	private String fname = "Rahul";
	private String lname = "Raj";
	public static void main(String[] args) {
		StringTest str=new StringTest();
		System.out.println(str.fname);
		System.out.println(str.lname);
		str.fname="sonu";
		str.lname="singh";
		System.out.println("after change name is "+str.fname+" "+str.lname);
	}
	

}
