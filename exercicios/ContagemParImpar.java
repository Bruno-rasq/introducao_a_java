package exercicios;

import java.util.Random;

public class ContagemParImpar {
	public static void main(String[] args) {

		Contador pares = new Contador("pares");
		Contador impares = new Contador("impares");
		Random rand = new Random();

		for(int i=0; i<100; i++){
			
			int n = rand.nextInt(50) + 1;
			if(n % 2 == 0){
				pares.incremento();
			} else {
				impares.incremento();
			}
		}

		System.out.println("pares = " + pares.contagem);
		System.out.println("impares = " + impares.contagem);
		
	}
}