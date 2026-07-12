package java_eight_plus_features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassExample {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Navin", "Laxmi", "John", "Kishor");
		
//		Optional<String> name = names.stream()
//									 .filter(str -> str.contains("x"))
//									 .findFirst();
		
		String name = names.stream()
				 .filter(str -> str.contains("x"))
				 .findFirst()
				 .orElse("Not Found");
		
		//System.out.println(name.get());
		//System.out.println(name.orElse("Not Found"));
		System.out.println(name);
	}

}
