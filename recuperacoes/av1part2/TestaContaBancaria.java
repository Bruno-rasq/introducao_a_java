package recuperacoes.av1part2;

import java.util.Scanner;

public class TestaContaBancaria {

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		ContaBancaria conta = new ContaBancaria();

		while(true){

			System.out.println("1 - depositar.");
			System.out.println("2 - sacar.");
			System.out.println("3 - ver saldo.");
			System.out.println("4 - sair.");

			int opcao = in.nextInt();
			float valor;

			switch(opcao){
				case 1: 
					System.out.println("insira o valor do deposito:");
					valor = in.nextFloat();
					conta.deposito(valor);
					break;
			

				case 2: 
					System.out.println("insira o valor do saque:");
					valor = in.nextFloat();
					conta.saque(valor);
					break;
				

				case 3:
					conta.consultaSaldo();
					break;

				case 4:
					return;

				default:
					break;
					
			}
		}
	}
}