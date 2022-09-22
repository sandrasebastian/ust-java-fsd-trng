package optional;

import java.util.Optional;

public class OptionalGetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating non null optional objects
		Optional<String>optional=Optional.of("hello");
		
		//checking value present in the optional or not.
		if(optional.isPresent()) {
			String value=optional.get();
			System.out.println("Optional value:"+value);
			
		}
		else {
			//if optional has no value
			System.out.println("Optional has no value");
		}

	}

}
