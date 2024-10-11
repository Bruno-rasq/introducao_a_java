package avaliacoes.semestre20181;

public class Cinema {

	private Sessao[] sessoes;

	Cinema(int Nsessoes){
		// oi mãe :)
		this.sessoes = new Sessao[Nsessoes];
	}

	void AdicionarSessao(Sessao sessao){

		
		for(int i = 0; i < this.sessoes.length; i++){
			if(this.sessoes[i] == null){
				this.sessoes[i] = sessao;
				return;
			}
			if(
				sessao.getHora() == this.sessoes[i].getHora() ||
				sessao.getNumeroSessao() == this.sessoes[i].getNumeroSessao()
			){
				return; //termina o metodo sem fazer nenhuma alteração
			}
		}

	}

	void verSessoes(){
		for(int i=0; i<this.sessoes.length; i++){
			System.out.println(this.sessoes[i].toString());
		}
	}
}