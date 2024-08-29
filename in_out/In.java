package in_out;

import java.util.Scanner;

public class In {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("qual seu nome?");
		
		String nome = input.nextLine();

		System.out.println("Olá, " + nome);
		input.close();
	}
}