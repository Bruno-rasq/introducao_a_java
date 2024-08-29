package condicionais;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args){

		int result, valor;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("insira um valor inteiro");

		valor = input.nextInt();

		switch(valor){
			case 0:
				result = 0;
			break;

			case 5:
				result = 5;
			break;

			default:
				result = 10;
			break;
		}

		System.out.println(result);
		input.close();
	}
}