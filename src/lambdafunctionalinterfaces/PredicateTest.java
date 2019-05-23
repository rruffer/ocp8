package lambdafunctionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {
	
	public static void main(String[] args) {
		
		Predicate<String> isALongWord = t -> t.length() > 10;
		
		String s = "successfully";
		
		boolean result = isALongWord.test(s);
		
		System.out.println(result);
		
		int f = 11;
		IntPredicate t = i -> i > 10;
		
		result = t.test(f);
		
		System.out.println(result);
		
	}

}
