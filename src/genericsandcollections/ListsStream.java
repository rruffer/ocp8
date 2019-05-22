package genericsandcollections;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;

import model.Person;

public class ListsStream {

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(60, "James"));
		persons.add(new Person(56, "Rodolfo"));
		persons.add(new Person(55, "Bryan"));
		
		persons.stream().filter(p -> p.getAge() > 55).forEach(out::println);
		out.println(persons.stream().filter(p -> p.getAge() > 55).count());
//		persons.stream().filter(p -> p.getAge() > 55).collect(Collectors.toList());
		
	}
	
}
