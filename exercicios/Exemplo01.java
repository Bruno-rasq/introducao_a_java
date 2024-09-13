public class Exemplo01 {
	public static void main(String[] args){
		int[] tab = new int[10];
		int n = 8;

		for(int i = 0; i<10; i++)
		{
			int curr = i * n;
			tab[i] = curr;
			System.out.println(tab[i]);
		}
		
	}
}