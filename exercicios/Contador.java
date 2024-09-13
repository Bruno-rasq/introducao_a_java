package exercicios;

public class Contador {
	int contagem;
	String nome;

	Contador(String nome){
		this.nome = nome;
	}

	void incremento(){
		this.contagem++;
	}
}