package method;

public class TeacherApp {
	void teach(){
		Teacher t= new Teacher();
		t.teaching();
	}
	
	public static void main(String[] args) {
		System.out.println("App Starts.");
		TeacherApp ta= new TeacherApp();
		ta.teach();
		System.out.println("App End.");
		
	}
}
