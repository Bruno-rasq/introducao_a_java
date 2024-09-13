public class Exemplo02 {
	public static void main(String[] args){
		int[] a = {23, 4, 2, 67, 10};
		int[] b = new int[5];

		for(int i = 0; i < 5; i++)
		{
			int value = a[i] * 3;
			b[i] = value;
			System.out.println(b[i]);
		}
	}
}