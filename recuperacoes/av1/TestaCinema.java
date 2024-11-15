package recuperacoes.av1;

public class TestaCinema {
	public static void main(String[] args){
		
		SalaDeCinema sala = new SalaDeCinema("sala A", 45);
		SalaDeCinema sala2 = new SalaDeCinema("sala A", 45);

		System.out.println(sala.toString());
		System.out.println("sala == sala2: " + sala.equals(sala2));

		for(int i = 0; i < 45; i++){
			sala.ocupaPoltrona();
			System.out.println(sala.toString());
		}

		System.out.println("sala == sala2: " + sala.equals(sala2));
	}
}