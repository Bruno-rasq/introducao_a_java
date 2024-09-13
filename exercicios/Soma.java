import java.util.Scanner;

public class Soma {
	public static void main(String[] args){
		int n1, n2, soma;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite n1: ");
		n1 = entrada.nextInt();

		System.out.println("Digite o segundo número:");
		n2 = entrada.nextInt();

		entrada.close();

		soma = n1 + n2;

		System.out.println("Soma = " + soma);
			
	}
}