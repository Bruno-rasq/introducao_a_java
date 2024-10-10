package avaliacoes.semestre20181;

public class Cinema {

	private Sessao[] sessoes;

	cinema(){
		// oi mãe :)
	}

	void AdicionarSessao(Sessao sessao){

		
		for(int i = 0; i < this.sessoes.lenght; i++){
			if(
				sessao.getHora().equals(this.sessoes[i].getHora()) ||
				sessao.getNumeroSessao().equals(this.sessoes[i].getNumeroSessao())
			){
				return; //termina o metodo sem fazer nenhuma alteração
			}
		}

		this.sessoes.append(sessao);
	}
}