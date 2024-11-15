package recuperacoes.av1;

public class SalaDeCinema {

	private String nome;
	private int poltronas;
	private int poltronas_ocupadas;

	SalaDeCinema(String nome, int poltronas){
		this.nome = nome;
		setPoltronas((poltronas));
	}

	void setPoltronas(int n){
		if(n >= 30 && n <= 50){
			this.poltronas = n;
			this.poltronas_ocupadas = 0;
			return;
		}
		this.poltronas = 30;
		this.poltronas_ocupadas = 0;
	}

	void ocupaPoltrona(){
		if(this.poltronas_ocupadas < this.poltronas){
			this.poltronas_ocupadas++;
		}
	}

	@Override
	public String toString(){
		return "Cinema: " + this.nome 
			+ " - Poltronas: " + this.poltronas 
			+ " - Ocupadas: " + this.poltronas_ocupadas;
	}

	@Override
	public boolean equals(Object obj){
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;

		SalaDeCinema sala = (SalaDeCinema) obj;

		return this.nome.equals(sala.nome) 
			&& this.poltronas == sala.poltronas 
			&& this.poltronas_ocupadas == sala.poltronas_ocupadas;
	}
}