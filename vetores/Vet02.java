package vetores;

public class Vet02 {
	public static void main (String[] args){
		int[] b = new int[5]; // definindo um vetor de tamanho 5

		b[0] = 3;
		b[1] = 6;
		b[2] = 9;
		b[3] = 12;
		b[4] = 15;

		String vet = "";
		for(int index: b){
			vet += index + " ";
		}

		System.out.println(vet);
	}
}