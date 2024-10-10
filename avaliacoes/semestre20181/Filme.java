package avaliacoes.semestre20181;

public class Filme {

	private String[] generosPossiveis = {"Acao", "Comedia", "Romance"};

	private String titulo, genero;
	private int faixaEtaria;

	Filme(String titulo, int faixaEtaria, String genero){
		this.setGenero(genero);
		this.setFaixaEtaria(faixaEtaria);
		this.titulo = titulo;
	}

	void setGenero(String genero){
		Boolean generoCorreto = false;
		for(int i = 0; i < this.generosPossiveis.length; i++){
			if(genero.equals(this.generosPossiveis[i])){
				generoCorreto = true;
				break;
			}
		}
		if(generoCorreto){
			this.genero = genero;
		} else {
			this.genero = "Não classificado";
		}
	}

	void setFaixaEtaria(int idade){
		if(idade >= 0){
			this.faixaEtaria = idade;
		} else {
			this.faixaEtaria = 0;
		}
	}

	String getTitulo(){
		return this.titulo;
	}
	
	String getGenero(){
		return this.genero;
	}
	
	int getFaixaEtaria(){
		return this.faixaEtaria;
	}
	
}