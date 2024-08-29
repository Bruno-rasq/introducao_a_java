package exercicios;

import java.util.Scanner;

//TODO: Faça um programa em Java que dado um número N, imprima os N primeiros números primos.

public class Exe04 {
	
	public static void main(String[] args){

		int n = 0;
		Scanner input = new Scanner(System.in);

		System.out.println("Digite um numero inteiro positivo:");
		n = input.nextInt();

		for (int i = 1; i <= n; i++){
			boolean atual = isPrime(i);
			if(atual == true){
				System.out.println(i);
			}
		}

		input.close();
	}

	public static boolean isPrime(int n){
		if( n == 1 ) return false;
		if( n == 2 ) return true;
		if( n % 2 == 0 ) return false;

		for (int i = 3; i <= Math.sqrt(n); i += 2){
			if(n % i == 0) return false;
		}
		return true;
	}
	
}