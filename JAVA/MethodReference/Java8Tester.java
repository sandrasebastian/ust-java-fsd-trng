package methodreference;

import java.util.ArrayList;
import java.util.List;

public abstract class Java8Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List names= new ArrayList();
		
		names.add("Mahesh");
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Naresh");
		names.add("Kalpesh");
		names.forEach(System.out::println);

	}

}
