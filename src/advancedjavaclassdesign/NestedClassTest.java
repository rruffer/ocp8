package advancedjavaclassdesign;


class OuterClasss {
	
	public class NestedClass {
		
		public void pritn() {
			System.out.println("teste");

		}
		
	}
	
}

public class NestedClassTest {

	public static void main(String[] args) {
		OuterClasss oc = new OuterClasss();
		OuterClasss.NestedClass nc = oc.new NestedClass();
		nc.pritn();
	}

}
