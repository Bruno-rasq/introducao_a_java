package exercicios;

import java.util.Scanner;

//TODOD: Faça um programa que receba quatro números inteiros, calcule e mostre a soma desses números.

public class Exe01 {
	public static void main(String[] args){
		
		int soma = 0;
		Scanner input = new Scanner(System.in);

		System.out.println("Insira o primeiro numero: ");
		soma += input.nextInt();
		
		System.out.println("Insira o segundo numero: ");
		soma += input.nextInt();
		
		System.out.println("Insira o tercweiro numero: ");
		soma += input.nextInt();
		
		System.out.println("Insira o quarto numero: ");
		soma += input.nextInt();

		input.close();
		System.out.println("soma = " + soma);
	}
}