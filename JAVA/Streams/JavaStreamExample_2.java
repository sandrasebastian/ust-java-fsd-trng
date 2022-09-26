package stream;

import java.util.ArrayList;
import java.util.List;

class Product_1{
	int id;
	String name;
	float price;
    public Product_1(int id,String name,float price) {
    	this.id=id;
    	this.name=name;
    	this.price=price;
    	
    }

}
public class JavaStreamExample_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product>productsList=new ArrayList<Product>();
		//Adding products
		productsList.add(new Product(1,"HP Laptop",25000f));
		productsList.add(new Product(2,"DELL Laptop",30000f));
		productsList.add(new Product(3,"Lenovo Laptop",28000f));
		productsList.add(new Product(4,"Sony Laptop",28000f));
		productsList.add(new Product(5,"Apple Laptop",90000f));
		//This is more compact approach for filtering data
		Float totalPrice=productsList.stream()
				.map(product->product.price) //fetching price
				.reduce(0.0f,(sum,price)->sum+price);//accumulating price
		System.out.println(totalPrice);
		//More precise code
		float totalPrice2=productsList.stream()
				.map(product->product.price) 
				.reduce(0.0f,Float::sum);//accumulating price,by reffering method of Float class
		System.out.println(totalPrice2);
		

	}

}
