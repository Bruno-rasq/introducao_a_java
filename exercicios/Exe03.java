package exercicios;

import java.util.Scanner;

//TODO: Faça um programa que simule um calculadora simples. O usuário deve informar dois números e a operação desejada e o sistema deve apresentaro resultado na tela.

public class Exe03 {
	public static void main(String[] args){

		int n1 = 0, n2 = 0, opcao, resultado;
		Scanner input = new Scanner(System.in);

		System.out.println("selecione a opcao desejada:");
		System.out.println("1 - adicao");
		System.out.println("2 - subtracao");
		System.out.println("3 - divisao");
		System.out.println("4 - multiplicacao");

		opcao = input.nextInt();
		
		System.out.println("Insira um valor:");
		n1 = input.nextInt();
		
		System.out.println("Insira um valor:");
		n2 = input.nextInt();

		switch(opcao){
			case 1:
				resultado = n1 + n2;
			break;
			case 2:
				resultado = n1 - n2;
			break;
			case 3:
				resultado = n1 / n2;
			break;
			case 4:
				resultado = n1 * n2;
			break;
			default:
				resultado = n1 + n2;
			break;
		}

		System.out.println("resultado = " + resultado);
		
	}
}