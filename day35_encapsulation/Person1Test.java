package day35_encapsulation;

public class Person1Test {

	public static void main(String[] args) {
		
		Person1 p1 = new Person1();
		p1.setAge(28);
		p1.setName("Mike ");
		
		System.out.println(p1.getName() + p1.getAge());
	}

}
