
public class multidiamensoinalarray {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
int lenght = a.length;
System.out.println("array lenght "  +lenght);
		
for(int i=0; i<a.length; i++) {
	for(int j=0; j<a.length; j++) {
	System.out.print(a[i][j] + " ");	
}
	System.out.println();
	}
}
}


