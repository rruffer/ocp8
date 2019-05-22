package advancedjavaclassdesign;

class OuterClass {
	
	public static class NestedStaticClass{
		public void print() {
			System.out.println("Message from nested static class");
		}
	}
	
}

public class StaticClassTest {

	
	public static void main(String[] args) {
		
		OuterClass.NestedStaticClass sc = new OuterClass.NestedStaticClass();
		sc.print();
		
	}
	
}
