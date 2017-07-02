package exercise.exam;

public class Student {
	public static void main(String[] args) {
		Student st=new Student();
		st.give();
	}
	public void give(){
		AnswerSheet as= new AnswerSheet();
		as.setName("rahul");
		as.setRoll(01);
		Teacher tc=new Teacher();
		tc.take(as);
	}
}
