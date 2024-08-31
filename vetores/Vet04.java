package vetores;

public class Vet04 {
	public static void main(String[] args){
		int[] numeros = {3, 5, 2, 7, 1};
		System.out.println(maiorElemento(numeros));
	}

	public static int maiorElemento(int[] n){
		int maior = 0;
		for (int numero : n){
			if(numero > maior)
				maior = numero;
		}
		return maior;
	}
}