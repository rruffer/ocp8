package advancedjavaclassdesign;

public class LocalInnerClassTest {

	private int n = 5;
	
	void result() {
		
		class Cube{
			int calc() {
				return n*n*n;
			}
		}
		
		Cube cube = new Cube();
		System.out.println(cube.calc());
		
	}
	
	public static void main(String[] args) {
		LocalInnerClassTest test = new LocalInnerClassTest();
		test.result();
	}
	
}
