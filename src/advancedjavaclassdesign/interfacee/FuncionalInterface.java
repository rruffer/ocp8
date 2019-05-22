package advancedjavaclassdesign.interfacee;

import java.util.Scanner;

@FunctionalInterface
interface MathFunction {

	int operation(int a, int b);

}

public class FuncionalInterface {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int num2 = scanner.nextInt();
		
		//operações
		MathFunction soma = (a, b) -> a + b;
		MathFunction subtracao = (a, b) -> a - b;
		MathFunction multiplicacao = (a, b) -> a * b;
		MathFunction divisao = (a, b) -> a / b;
		
		System.out.println(soma.operation(num1, num2));
		System.out.println(subtracao.operation(num1, num2));
		System.out.println(multiplicacao.operation(num1, num2));
		System.out.println(divisao.operation(num1, num2));

	}

}
