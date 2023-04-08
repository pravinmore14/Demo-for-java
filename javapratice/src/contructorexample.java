
public class contructorexample {
int i;
public contructorexample() {
	System.out.println("in constructor");
}

public contructorexample(int a) {
	System.out.println("valu of int" +a);
}
 public static void main(String[] args) {
	 contructorexample c1 =new contructorexample();
	 contructorexample c2 =new contructorexample(10);
	 contructorexample c3 =new contructorexample(20);
	}

}
