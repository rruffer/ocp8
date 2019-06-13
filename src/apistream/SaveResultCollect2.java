package apistream;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import model.Course;
import model.Student;

public class SaveResultCollect2 {

	public static void main(String[] args) {
		
		List<Course> courses = new ArrayList<>();
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(1, "Rodolfo"));
		students.add(new Student(2, "Marcos"));
		students.add(new Student(3, "Tereza"));
		
		courses.add(new Course(students, "Informática"));
		
		List<String> list = courses.stream().flatMap(c -> c.getStudents().stream()).map(s -> s.getName()).collect(Collectors.toList());
		
		list.forEach(System.out::println);
		
		
		
		
	}

}
