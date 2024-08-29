package exercicios;

import java.util.Scanner;

//TODO: Faça um programa em Java que receba três notas, calcule e mostre a média aritmética entre elas. Ainda, informe se esse aluno está aprovado, em recuperação ou reprovado.

public class Exe02 {
	public static void main(String[] args){

		Float media, soma = 0.0f;
		Scanner input = new Scanner(System.in);

	
		for (int i = 0; i < 3; i++){
			System.out.println("Digite uma nota: ");
			soma += input.nextFloat();
		}

		media = soma / 3;
		input.close();

		if (media >= 6.6){
			System.out.println("Aula aprovado! media = " + media);
		
		} else if (media < 6.6 && media >= 3.0){
			System.out.println("Aula em recuperacao, media = " + media);	
			
		} else {
			System.out.println("Aluno reprovado! media = " + media);
		}

	}
}