package avaliacoes.semestre20242;

/*

	Mural da vergonha:

	-troquei as bolas.
	em C++ é possivel verificar igualdade de strings usando o operador == já em java não (precisa do equals())

	em c++ para concatenar string com number precisa fazer um parse dos dados (to_string()) já em java não.
*/

public class Estudante {

	private String nome;
	private float n1, n2, n3;

	Estudante(String nome, float nota1, float nota2, float nota3){
		this.nome = nome;
		// acho que esqueci o this em this.SetNota()
		this.n1 = this.SetNota(nota1); 
		this.n2 = this.SetNota(nota2);
		this.n3 = this.SetNota(nota3);
	}

	float SetNota(float nota){
		if(nota >= 0 && nota <= 10){
			return nota;
		}
		return 0.0f;
	}

	float GetNota(int nota){
		if(nota == 1)
			return this.n1;
		if(nota == 2)
			return this.n2;
		if(nota == 3)
			return this.n3;
		else
			return this.n1;
	}

	float CalcularMedia(){
		return (this.n1 + this.n2 + this.n3) / 3;
	}

	Boolean VerificarAprovacao(){
		float media = this.CalcularMedia();
		if(media >= 6.0){
			return true;
		}
		return false;
	}

	@Override
	public String toString(){
		//removi o to_string() 
		return "Aluno: " + this.nome + " media: " + this.CalcularMedia() + " Aprovado: " + this.VerificarAprovacao();
	}

	//metodo equals eu errei...
	@Override
	public boolean equals(Object o){
		Estudante aluno = (Estudante) o;
		//errado: 
		//if(this.nome == aluno.nome){
			//return true;
		//}

		//correto:
		if(this.nome.equals(aluno.nome)){
			return true;
		}
		return false;
	}
}