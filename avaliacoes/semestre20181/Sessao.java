package avaliacoes.semestre20181;

public class Sessao {
	
 	private int maxSessao = 10;
	private int maxNumeroAscentos = 100;
	private int minHora = 14, maxHora = 22;
	
	private Filme filme;
	private int numero_sessao, numero_ascentos, hora;

	Sessao(Filme filme, int nSessao, int nAscentos, int hora){
		this.filme = filme;
		this.setNumeroSessao(nSessao);
		this.setNumeroAscentos(nAscentos);
		this.setHoraSessao(hora);
	}

	void setNumeroSessao(int n){
		if(n >= 1 && n <= this.maxSessao){
			this.numero_sessao = n;
		} else {
			this.numero_sessao = 1;
		}
	}

	void setNumeroAscentos(int a){
		if(a >= 1 && a <= this.maxNumeroAscentos){
			this.numero_ascentos = a;
		} else {
			this.numero_ascentos = 1;
		}
	}

	void setHoraSessao(int hora){
		if(hora >= this.minHora && hora <= this.maxHora){
			this.hora = hora;
		} else {
			this.hora = 14;
		}
	}

	int getNumeroSessao(){
		return this.numero_sessao;
	}

	int getHora(){
		return this.hora;
	}

	int getNAscentos(){
		return this.numero_ascentos;
	}

	@Override
	public String toString(){
		return "Filme: " + this.filme.getTitulo() + " genero: " + this.filme.getGenero() + " classificação indicativa: " + this.filme.getFaixaEtaria() + "\n" + "sessão: " + this.getNumeroSessao() + " Horário: " + this.getHora() + " Ascentos" + this.getNAscentos() + "\n";
	}
}