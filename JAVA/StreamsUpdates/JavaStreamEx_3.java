package streamsupdate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product2{
	int id;
	String name;
	float price;
	public Product2(int id,String name,float price) {
		this.id=id;
		this.name=name;
		this.price=price;
		
	}
}
public class JavaStreamEx_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product>ProductList=new ArrayList<Product>();
		ProductList.add(new Product(1,"HP Laptop",25000f));
		ProductList.add(new Product(2,"Dell Laptop",30000f));
		ProductList.add(new Product(3,"Lenevo Laptop",28000f));
		ProductList.add(new Product(4,"Sony Laptop",28000f));
		ProductList.add(new Product(5,"Apple Laptop",90000f));
		Float totalPrice=ProductList.stream().map(product->product.price).reduce(0.0f,(sum,price)->sum+price);;
				System.out.println(totalPrice);
				float totalPrice2=ProductList.stream().map(product->product.price).reduce(0.0f,Float::sum);
				System.out.println(totalPrice2);
						
				
		System.out.println(totalPrice2);
		
	}

}
