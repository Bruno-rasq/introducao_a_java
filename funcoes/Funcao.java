package funcoes;

//funcoes retornam valores.

public class Funcao {
	public static void main(String[] args){
		int a = 6;
		int b = 4;
		int soma = soma(a, b);
		System.out.println(soma);
	}

	public static int soma(int n1, int n2){
		return n1 + n2;
	}
}