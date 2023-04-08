package Practise;
public class MultiInheritance {
	public static void main(String[] args) {

 class a {

	int a,b,c;
	
	void add(){
	a=10;b=33;
	c=a+b;
	System.out.println("addition is :"+""+c);
	}
	void sub(){
	a=40;b=33;
	c=a-b;
	System.out.println("substraction is :"+""+c);
	}}
	class Sub1 extends a{
	void mult(){
	a=100;b=20;
	c=a*b;
	System.out.println("mutliplication is :"+""+c);
	}
	void div(){
	a=100;b=20;
	c=a/b;
	System.out.println("division is :"+""+c);
	}}
	class Sub2 extends  Sub1 {
	void reminder(){
	a=100;b=20;
	c=a%b;
	System.out.println("reminder is :"+""+c);
	System.out.println("Iam in Sub2 class");
	}}
	Sub2 a=new Sub2();
	a.add(); a.sub(); a.div(); a.mult(); a.reminder();
	}}
