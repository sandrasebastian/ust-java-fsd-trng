package Day5set2;
import java.util.TreeSet;
import java.util.Iterator;
public class Iterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer>numbers=new TreeSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(6);
		System.out.println("TreeSet:"+numbers);
		
		//calling iterator()method
		Iterator<Integer>iterate=numbers.iterator();

	
		System.out.print("TreeSet using Iterator:");
		
		//accessing elements
		while(iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(",");
		}
		
		

	}

}
