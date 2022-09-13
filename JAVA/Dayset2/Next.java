package Day5set2;
import java.util.ArrayList;
import java.util.Iterator;

public class Next {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating an ArrayList
		ArrayList<Integer>numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(2);
		System.out.println("ArrayList:"+numbers);
		
		//creating an instance of iterator
		Iterator<Integer>iterate=numbers.iterator();
		
		//using the next()method
		while(iterate.hasNext()) {
			//Using the forEachRemaining()method
			iterate.forEachRemaining((value)->System.out.print(value+","));
		}

	}

}
