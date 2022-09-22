package defaultstaticmethods;

public class Java8Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Vehicle vehicle=new Car();vehicle.print();
	}

}
interface Vehicle{
	default void print() {
		System.out.println("I am a vehicle!");
	
	}
	static void blowHorn() {
	System.out.println("Blowing horn!!!");
	
	
	}
}
interface FourWheeler{
	default void print() {
		System.out.println("I am a FourWheeler!");
	}
}
class Car implements Vehicle,FourWheeler{
	public void print() {
		Vehicle.super.print();
		FourWheeler.super.print();
		Vehicle.blowHorn();
		System.out.println("I am a car!");
	}
}