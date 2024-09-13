package classes;

public class Pessoa {

	string name;
	int idade;

	Pessoa(string nome, int idade){
		this.name = nome;
		this.idade = idade;
	}

	void fazAniversario(){
		this.idade++;
	}
}