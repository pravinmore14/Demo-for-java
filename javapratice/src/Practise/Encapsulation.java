package Practise;
class Student{
	private int Rollno=10;
	public void setRollno(int no) {
		Rollno=no;
	}
	public int getRollno() {
		return Rollno;
}

}


public class Encapsulation {

	public static void main(String[] args) {
		Student s=new Student();
s.setRollno(101);
System.out.println(s.getRollno());
	}

}
