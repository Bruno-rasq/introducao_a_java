package avaliacoes.semestre20242;

public class TestaAluno {
	public static void main(String[] args){

		Estudante e1 = new Estudante("Bruno", 6.0f, 7.5f, 8.0f);
		Estudante e2 = new Estudante("Fire", 0.0f, 3.4f, 5.5f);

		System.out.println(e1.toString());
		System.out.println(e2.toString());
		
	}
}