package optional;

import java.util.Optional;

public class OptionalClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String>strOptional=Optional.of("ONETWOTHREE");//optional contains string value
		
		Optional<String>srOptional1=strOptional.map(String::toLowerCase);//empty optional object
		srOptional1.ifPresent(System.out::println);


	}

}
