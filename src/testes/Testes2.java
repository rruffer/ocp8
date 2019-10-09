package testes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 
 * @author rodolfo.mindtek </br>
 *@link http://iteratrlearning.com/java9/2016/09/13/java9-timeouts-completablefutures.html
 *@link https://www.baeldung.com/java-completablefuture
 */
public class Testes2 {

	public static void main(String[] args) throws Exception {
		
		
		String aa = "Hello";
		String ba = "hello";
		
		String a  = java.util.Arrays.asList(aa.split("|")).stream().map(String::toLowerCase).sorted().collect(java.util.stream.Collectors.joining(""));
		String b  = java.util.Arrays.asList(ba.split("|")).stream().map(String::toLowerCase).sorted().collect(java.util.stream.Collectors.joining(""));
		System.out.println(a);
		System.out.println(b);
		
		
		System.out.println(a.equals(b) ? "Anagrams":"Not Anagrams");
		//String b = 
        
	}
	
    public static void java8 (String s, int k) {

		
		java.util.List<String> letras = java.util.Arrays.asList(s.split("|"));
		
		String min = letras.stream().min(java.util.Comparator.naturalOrder()).orElse(null);
		String max = letras.stream().max(java.util.Comparator.naturalOrder()).orElse(null);
		
		System.out.println(s.substring(s.indexOf(min), s.indexOf(min) + k));
		System.out.println(s.substring(s.indexOf(max), s.indexOf(max) + k));
    
    }
    
    public static void javaPuro() {
		String s = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
		int k = 30;
		
		String min = s.substring(0, k);
		String max = "";
		
		for(int i = 0; i < s.length(); i++) {
			String atual = String.valueOf(s.charAt(i));
			if(min.compareTo(atual) > 0) {
				min = atual;
			} 
			
			if(max.compareTo(atual) < 0) {
				max = atual;	
			}
			
		}

		
		System.out.println(max);
		System.out.println(min);
		
		System.out.println(s.indexOf(min));
		
		System.out.println(s.substring(s.indexOf(min), s.indexOf(min) + k));
		System.out.println(s.substring(s.indexOf(max), s.indexOf(max) + k));
    }
    
    private static void javaSet() {
		
		String s = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
		int k = 30;
			
		java.util.SortedSet<String> sets=new java.util.TreeSet<>();
	    for(int i=0; i<=s.length()-k; i++){
	        sets.add(s.substring(i,i+k));
	    }
	    System.out.println(sets.first());
	    System.out.println(sets.last());
	    

	}
	

}
