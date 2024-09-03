public class Exemplo03 {
	
	public static void main(String[] args) 
	{
		int[] a = {1, 2, 3, 4, 5};

		print(a);
		
		dobro(a);

		print(a);

		int soma = reduce(a);

		System.out.println(soma);

		int[] rev = reverse(a);

		print(rev);
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