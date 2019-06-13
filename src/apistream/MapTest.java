package apistream;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.Employee;

public class MapTest {

	public static void main(String[] args) {

//		Stream.of("a", "b", "c", "d").map(String::toUpperCase).forEach(out::println);
		
		List<Employee> listEmployees = new ArrayList<>();
		listEmployees.add(new Employee(1, "Lucas"));
		listEmployees.add(new Employee(2, "Pedro"));
		
//		List<Integer> listIds = listEmployees.stream().mapToInt(e -> e.getId()).boxed().collect(Collectors.toList());
//		List<Integer> listIds = listEmployees.stream().mapToInt(e -> e.getId()).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		List<Integer> listIds = listEmployees.stream().map(Employee::getId).collect(Collectors.toList());
		
		listIds.forEach(out::println);
		
		out.println(listIds.stream().anyMatch(i -> i >= 1));
		
	}

}
