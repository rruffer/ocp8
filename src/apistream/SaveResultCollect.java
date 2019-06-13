package apistream;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SaveResultCollect {

	public static void main(String[] args) {
		
		List<String> word = new ArrayList<>();
		
		List<String> letters = new ArrayList<>();
		letters.add("H");
		letters.add("e");
		letters.add("l");
		letters.add("l");
		letters.add("o");
		
/*		for (String s : letters) {
		   word.add(s.toUpperCase());
		}*/
		
//		word = letters.stream().collect(() -> new ArrayList<>(), (c, s) -> c.add(s.toUpperCase()), (c1, c2) -> c1.addAll(c2));
//		word = letters.stream().collect(ArrayList::new, (c, s) -> c.add(s.toUpperCase()), ArrayList::addAll);
		word = letters.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		
		//word.forEach(System.out::println);
		
		
		// Acumule em um TreeSet
		Set<String> set = letters.stream()
		                          .map(s -> s.toUpperCase())
		                          .collect(Collectors.toCollection(TreeSet::new));
		
		System.out.println(set);

		// Converta elementos em strings e concatene-os, separados por vírgulas
		String joined = letters.stream()
		                      .map(s -> s.toUpperCase())
		                      .collect(Collectors.joining(", "));
		System.out.println(joined);

		// Compute a soma de todas as letras
		int total = letters.stream()
		                      .collect(Collectors.summingInt(s -> s.length()));
		System.out.println(total);

		// Agrupar por letra inicial
		Map<String, List<String>> grouped = letters.stream()
		                                    .collect(Collectors.groupingBy(s -> s.substring(0,1)));
		System.out.println(grouped);

		// Partição de letras em maiúsculas e minúsculas
		Map<Boolean, List<String>> upperLower = letters.stream()
		                                    .collect(Collectors.partitioningBy(s -> Character.isUpperCase(s.codePointAt(0))));
		System.out.println(upperLower);
		
		

	}

}
