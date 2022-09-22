package optional;

import java.util.Optional;

public class OptionalClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String>str=Optional.of("one");//optional contains string value
		System.out.println(str.orElse("defaultvalue"));//outputs one
		Optional<String>str1=Optional.empty();//empty optional object
		System.out.println(str1.orElse("defaultvalue"));//defaultvalue is returned

	}

}
