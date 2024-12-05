package OOPS;

public class Student {

	int id=10046;					//Field or data member or instance variable
	String name="Saurav";
	 
	public static void main(String[] args) {
		
		Student s1=new Student();     //Creating Object
		
		System.out.println(s1.name); // accessing member through reference variable
		System.out.println(s1.id);
		
	}

}
