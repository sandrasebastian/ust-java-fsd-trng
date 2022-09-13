package Day5set2;
import java.util.TreeMap;

public class Put {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating TreeMap of even numbers
		TreeMap<String,Integer>evenNumbers=new TreeMap<>();
		
		//using put()
		evenNumbers.put("Two",2);
		evenNumbers.put("Four",4);
		
		//Using putIfAbsent()
		evenNumbers.putIfAbsent("Six",6);
		System.out.println("TreeMap of numbers:"+evenNumbers);	
		//creating TreeMap of numbers
		
		TreeMap<String,Integer>numbers=new TreeMap<>();
		numbers.put("One",1);
		
		//using putALL()
		numbers.putAll(evenNumbers);
		System.out.println("TreeMap of numbers:"+numbers);
		
		
		

	}

}
