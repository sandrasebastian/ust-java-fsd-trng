package EnumDoc;
enum Size1{
	SMALL,MEDIUM,LARGE,EXTRALARGE
}
class Test{
	Size pizzaSize;
	public Test(Size pizzaSize) {
		this.pizzaSize=pizzaSize;
	}
	public void orderPizza() {
		switch(pizzaSize) {
		case SMALL:
			System.out.println("I order a small size pizza.");
			break;
		case MEDIUM:
			System.out.println("I order a medium size pizza.");
			break;
		default:
			System.out.println("I don't know which one to order");
			break;
				
		}
		
	}
}

public class PizzaSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test(Size.MEDIUM);
		t1.orderPizza();
		
		


	}

}
