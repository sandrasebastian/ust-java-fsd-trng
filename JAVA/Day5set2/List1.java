package Day5set2;
import java.util.ArrayList;
import java.util.List;
public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer>numbers=new ArrayList<>();
		
		//Add elements to the list
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println("List:"+ numbers);
		//Access elements from the list
		int number= numbers.get(2);
		System.out.println("Accessed Element:"+number);
		
		//Remove element from the list
		int removedNumber=numbers.remove(1);
		System.out.println("Removed Element:"+removedNumber);
		

	}

}
