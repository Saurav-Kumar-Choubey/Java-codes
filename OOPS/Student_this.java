package OOPS;

public class Student_this {

		int rollno;
		String name;
		float fee;
		public Student_this(int rollno, String name, float fee) {
			super();
			this.rollno = rollno;
			this.name = name;
			this.fee = fee;
		}
		
		void display() {
			System.out.println(rollno +  " "+ name+ " "+ fee);
		}
}
