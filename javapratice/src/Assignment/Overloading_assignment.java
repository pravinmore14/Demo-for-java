package Assignment;

public class Overloading_assignment {
	int r;
public void volume(int s) {
	System.out.println("volume of cube   => s*s*s");
}
public void volume(int l,int b,int h) {
	System.out.println("volume of cuboid => l*b*h");
}
public void volume() {
	System.out.println("volume of sphere => 4/3*3.14*r*r*r");
}

	public static void main(String[] args) {
		Overloading_assignment obj =new Overloading_assignment();
		  obj.volume(2);
		  obj.volume(3, 3, 3);
		  obj.volume(); 
	}
}