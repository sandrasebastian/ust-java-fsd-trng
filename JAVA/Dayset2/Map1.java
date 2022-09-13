package Day5set2;
import java.util.Map;
import java.util.HashMap;
public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating a map using HashMap
		Map<String,Integer>numbers=new HashMap<>();
		
		//Insert elements into map
		numbers.put("one",1);
		numbers.put("Two",2);
		System.out.println("Map:"+numbers);
		
		//access key of the map
		System.out.println("keys:"+numbers.keySet());
		
		//access value of the map
		System.out.println("values:"+numbers.values());
		
		//access entries of the map
		System.out.println("Entries:"+numbers.entrySet());
		
		//Removed elements from the map
		int value=numbers.remove("Two");
		System.out.println("Removed value:"+value);
				
				


	}

}
