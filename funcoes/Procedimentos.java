package funcoes;


// procedimentos não retornam valores.

public class Procedimentos {
	public static void main(String[] args){
		
		for(int i = 1; i <= 10; i++){
			tabuada(i);
		}
	}

	//prodecimento
	static void tabuada(int n){
		int i = 1;
		while(i <= 10){
			System.out.println(n + " * " + i + " = " + (n * i));
			i++;
		}
		System.out.println("==================");
	}
}