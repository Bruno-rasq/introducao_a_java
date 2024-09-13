package classes;

public class TesteContador {
	public static void main(String[] args){

		Contador cronometro = new Contador(25);

		for(int i = 0; i <= 50; i++){
			System.out.println(cronometro.contagem);
			cronometro.incremento();
		}
	}
}