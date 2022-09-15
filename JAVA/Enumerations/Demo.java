package Enumerations;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>hs=new HashSet<String>();
		hs.add("P");
		hs.add("Q");
		hs.add("R");
		Enumeration E=Collections.enumeration(hs);
		while(E.hasMoreElements())
			System.out.println(E.nextElement());
		

	}

}
