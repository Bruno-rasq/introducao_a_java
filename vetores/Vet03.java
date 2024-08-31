package vetores;

import java.util.Scanner;

public class Vet03 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		String[] nomes = new String[6];

		for(int i = 0; i < nomes.length; i++){
			System.out.println("Insira um nome");
			nomes[i] = input.nextLine();
		}

		System.out.println("Nomes inseridos:");

		int i = 0;
		while(i < nomes.length){
			System.out.println(nomes[i]);
			i++;
		}
	}
}