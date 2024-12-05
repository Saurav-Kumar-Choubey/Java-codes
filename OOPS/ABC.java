package OOPS;

public class ABC {
	
	int rollno;
	String name,course;
	float fee;
	
	public ABC(int rollno, String name, String course) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}
	
	public ABC(int rollno, String name, String course, float fee) {
		this(rollno,course,name);
		this.fee = fee;
	}
	
	
	void display()
	{
		System.out.println(rollno + " " + name + " " + course + " "+ fee);
	}


}
