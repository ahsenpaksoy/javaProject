package day37_Inheritance;

public class School {

	public static void main(String[] args) {
		
		Person person  = new Person();
		Student student = new Student();
		
		person.name = "Mike";
		person.age = 35;
		person.gender = 'M';
		
		student.name = "Smith";
		student.age = 30;
		student.gender = 'M';
		
		student.studentId = 1000;
		
		person.eat("Steak");
		student.eat("Pizza");
		//person.code("Java"); //person class doesn't have code method

	}

}
