package OOPS;

public class Student3 {
	
	int rollno;
	String name;
	
	
	
	public Student3(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	void insertRecord(int r,String n)
	{
		rollno=r;
		name=n;
	}
	
	void displayInformation(){
		System.out.println(rollno + " " + name);
	}

}
