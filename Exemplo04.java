import java.util.Scanner;

public class Exemplo04 {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int tamanho;

		System.out.println("digite um tamanho para o vetor, exem: 2 ou 5...");

		tamanho = entrada.nextInt();
		
		int[] a = criarVetor(tamanho);

		print(a);

		dobro(a);

		print(a);

		int soma = reduce(a);

		System.out.println(soma);

		int[] rev = reverse(a);

		print(rev);

		entrada.close();
	}

	public static int[] criarVetor(int tamanho)
	{
		Scanner entrada = new Scanner(System.in);
		
		int[] vet = new int[tamanho];
		for(int i= 0; i < tamanho; i++){
			System.out.println("insira um valor inteiro:");
			int valor = entrada.nextInt();
			vet[i] = valor;
		}
		
		entrada.close();
		return vet;
	}

	public static void dobro(int[] arr)
	{
		int len = arr.length - 1;
		for(int i=0; i<len; i++){
			arr[i] *= 2;
		}
	}

	public static void print(int[] arr)
	{
		for(int i: arr)
			System.out.print(i + " ");
		System.out.println();
	}

	public static int reduce(int[] arr)
	{
		int soma = 0, len = arr.length - 1;
		for(int i = 0; i<=len; i++){
			soma += arr[i];
		}
		return soma;
	}

	//criar uma função ou procedimento que inverta um vetor
	public static int[] reverse(int[] arr) 
	{
		int len = arr.length - 1;
		int[] rev = new int[len + 1];

		for(int i=0; i<=len; i++){
			rev[i] = arr[len - i];
		}

		return rev;
	}
}