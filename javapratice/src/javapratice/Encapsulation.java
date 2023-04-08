package javapratice;

public class Encapsulation {
private int Rawagent;
public void setRawagent(int Raw) {
	Rawagent=Raw;
}

public int  getRawagent() {
	return Rawagent;
}

	public static void main(String[] args) {
		Encapsulation obj=new Encapsulation();
obj.setRawagent(10);

System.out.println(obj.getRawagent());
	}
}
