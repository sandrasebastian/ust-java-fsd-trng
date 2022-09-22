package optional;

import java.util.Optional;

public class OptionalClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<Object>objOptional=Optional.ofNullable(null);
		System.out.println(objOptional.isPresent());//outputs false
		Optional<String>strOptional=Optional.ofNullable("One");
		System.out.println(strOptional.isPresent());//output true
		
		

	}

}
