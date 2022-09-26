package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	float price;
	public Product(int id,String name,float price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class JavaStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product>productsList=new ArrayList<Product>();
		//Adding products
		productsList.add(new Product(1,"HP Laptop",25000f));
		productsList.add(new Product(2,"DELL Laptop",30000f));
		productsList.add(new Product(3,"Lenovo Laptop",28000f));
		productsList.add(new Product(4,"Sony Laptop",28000f));
		productsList.add(new Product(5,"Apple Laptop",90000f));
		List<Float>productPriceList2=productsList.stream()
				.filter(p->p.price>30000)//filtering data
				.map(p->p.price) //fetching price
				.collect(Collectors.toList());
		System.out.println(productPriceList2);
				

	}

}
