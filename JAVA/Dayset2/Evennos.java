package Day5set2;
import java.util.LinkedHashMap;
public class Evennos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating LinkedHashMap of even numbers
		LinkedHashMap<String,Integer>evenNumbers=new LinkedHashMap<>();
		evenNumbers.put("Two",2);
		evenNumbers.put("Four",4);
		System.out.println(" Linked HashMap1:"+evenNumbers);
		
		//creating LinkedHashMap from other  LinkedHashMap
				LinkedHashMap<String,Integer>numbers=new LinkedHashMap<>(evenNumbers);
				numbers.put("Three",3);
				System.out.println(" Linked HashMap2:"+numbers);
		
		
		

	}

}
