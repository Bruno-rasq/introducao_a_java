package classes;

public class TestePessoa {
	public static void main (String[] args){

		Pessoa julia = new Pessoa("julia", 21);

		System.out.println("nome = " + julia.name);
		System.out.println("idade = " + julia.idade);

		julia.fazAniversario();

		System.out.println("nova idade de  " + julia.name + " é " + julia.idade);
			
	}
}