package Day5set2;
import java.util.HashSet;
public class Hashset {

	private static String numbers;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer>evenNumber=new HashSet<>();
		
		//using add() method
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		System.out.println("TreeMap of numbers:"+evenNumber);
		
		HashSet<Integer>Number=new HashSet<>();
		
		//Using addAll()method
		Number.addAll(evenNumber);
		Number.add(5);
		System.out.println("New HashSet:"+numbers);


	}

}
