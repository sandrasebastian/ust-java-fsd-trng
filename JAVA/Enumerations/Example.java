package Enumerations;
import java.util.*;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(14);
		list.add(2);
		list.add(73);
		Enumeration en=Collections.enumeration(list);//getting enumeration over
		ArrayList list1;
		while(en.hasMoreElements())
			while(en.hasMoreElements()) {
				System.out.println(en.nextElement());
			}
		

	}

}
