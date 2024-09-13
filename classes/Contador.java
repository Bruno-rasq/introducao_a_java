package classes;

public class Contador {
	int contagem = 0, max;

	Contador(int MAX){
		this.max = MAX;
	}

	void incremento(){
		if(this.contagem <= this.max){
			this.contagem++;
		} else {
			this.contagem = 0;
		}
	}
}