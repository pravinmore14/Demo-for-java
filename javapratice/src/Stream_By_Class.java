import java.util.ArrayList;
import java.util.List;

class Product{
int id;
double price;
String name;

Product(int id,double price,String name){

this.id= id;
this.price= price;
this.name= name;
  }
  }
public class Stream_By_Class {
	public static void main(String[] args) {
		List <Product> productlist=new ArrayList< Product>();
productlist.add(new Product (1,25000,"dell"));
productlist.add(new Product (2,19000,"lenovo"));
productlist.add(new Product (3,21000,"hp"));
productlist.add(new Product (4,30000,"Apple"));

productlist.stream().filter(p->p.price>20000).forEach(pr->System.out.println(pr.price));

	}
}

