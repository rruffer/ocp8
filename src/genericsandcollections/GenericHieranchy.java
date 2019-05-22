package genericsandcollections;

import java.util.ArrayList;
import java.util.List;

class Testt{}
class Animal extends Testt{}
class Dog extends Animal {}
class Cat extends Animal {}

public class GenericHieranchy {

	public static void main(String[] args) {
		
		List<?> test1 =  new ArrayList<>();
//		test1.add(1);
		
		for(Object o : test1){
		      System.out.println(o);
		}
		
		List<? extends Animal> test2 =  new ArrayList<>();
//		test2.add(new Dog());
		
		for(Animal a : test2) {
			System.out.println(a);
		}
		
		List<? super Animal> test3 =  new ArrayList<>();
		test3.add(new Animal());
		test3.add(new Dog());
		test3.add(new Cat());
	//	test3.add(new Testt());
		
		for(Object o : test3) {
			System.out.println(o);
		}
		
	}

}
