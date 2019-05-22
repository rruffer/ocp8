package advancedjavaclassdesign.interfacee;

interface Vehicle {
	
	default public void start() {
		System.out.println("Default start");
	}
	
}

public class MetothDefault implements Vehicle {

	public static void main(String[] args) {
		new MetothDefault().start();

	}

}
