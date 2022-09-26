package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<String>str=new ArrayList<>();
    str.add("Vishnu");
    str.add("Ashiq");
    str.add("Vyshak");
    Predicate sp= s->s.equals("Ashiq");
    Stream sr=str.stream().filter(sp);
    System.out.println(sr.collect(Collectors.toList()));
    }

}
