package apistream;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

import genericsandcollections.Compare;

public class DataMethods {

	public static void main(String[] args) {
		
		Comparator<String> byLength = (s1, s2) -> Integer.compare(s1.length(), s2.length());
		
		Optional<String> max = Stream.of("hello","good bye", "black", "white", "good", "bad").max(byLength);
		Optional<String> min = Stream.of("hello","good bye", "black", "white", "good", "bad").min(byLength);
		long count = Stream.of("hello","good bye", "black", "white", "good", "bad").count();
		
		System.out.println(max);
		System.out.println(min);
		System.out.println(count);
	}

}
