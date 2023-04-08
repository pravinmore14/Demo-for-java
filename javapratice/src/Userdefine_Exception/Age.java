package Userdefine_Exception;
import Userdefine_Exception.TestClass;
public class Age extends Exception {
Age(String str){  //age is constructor which will accept string msg 
	System.out.println(str);  //it will print message whatever association with throw
}
}