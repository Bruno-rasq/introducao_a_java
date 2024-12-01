package trabalho2;

public class SerieTV {

	//propriedades todas privadas
	private String titulo,genero;
	private int temporadas, ano;
	private boolean concluida;

	SerieTV(){} //construtor padrao

	//construtor com parametros
	SerieTV(String titulo, String genero, int ano, int temporada, boolean concluida)
	{
		this.setTitulo(titulo);
		this.setGenero(genero);
		this.setTemporadas(temporada);
		this.setAnoLancamento(ano);
		this.concluida = concluida;
	}

	//Setters
	public void setTitulo(String titulo)
	{
		if(!titulo.equals("")){
			this.titulo = titulo;
			return;
		}
		this.titulo = "Sem Titulo";
	}

	public void setGenero(String genero)
	{
		String[] generosPossiveis = {"comedia", "romance", "ficcao", "drama"};

		for(String gen: generosPossiveis){
			if(gen.equals(genero)){
				this.genero = genero;
				return;
			}
		}

		this.genero = "ficcao"; //genero padrão.
	}

	public void setTemporadas(int temporadas)
	{
		if(temporadas >= 1){
			this.temporadas = temporadas;
			return;
		}

		this.temporadas = 1;
	}

	public void setAnoLancamento(int ano)
	{
		if(ano >= 2020){
			this.ano = ano;
			return;
		}
		this.ano = 2020;
	}

	//Getters
	public String getTitulo()
	{ return this.titulo; }

	public String getGenero()
	{ return this.genero; }

	public int getAnoLancamento()
	{ return this.ano; }

	public int getNumeroTemporadas()
	{ return this.temporadas; }

	public boolean getSerieConcluida()
	{ return this.concluida; }

	//Metodos
	public void setSerieTVCSV(String serie)
	{
		String[] serietv = serie.split(";");

		this.setTitulo(serietv[0]);
		this.setGenero(serietv[1]);
		this.setAnoLancamento(Integer.parseInt(serietv[2]));
		this.setTemporadas(Integer.parseInt(serietv[3]));
		this.concluida = Boolean.parseBoolean(serietv[4]);
	}

	public String getSerieTVCSV()
	{
		return this.titulo + ";" +
			this.genero + ";" +
			this.ano + ";" +
			this.temporadas + ";" +
			this.concluida;
	}

	@Override
	public String toString()
	{
		return "Nome: " + this.getTitulo() + "\n" +
			"genero: " + this.getGenero() +
			" temporadas: " + this.getNumeroTemporadas() +"\n" +
			"Ano: " + this.getAnoLancamento() +
			" status concluida: " + this.getSerieConcluida();
	}

	@Override
	public boolean equals(Object serie)
	{
		if(serie == this){ return true; }
		if(serie == null || this.getClass() != serie.getClass())
			return false;

		SerieTV s = (SerieTV) serie;

		return this.titulo.equals(s.titulo) 
			&& this.getGenero().equals(s.getGenero())
			&& this.getAnoLancamento() == s.getAnoLancamento() 
			&& this.getNumeroTemporadas() == s.getNumeroTemporadas() 
			&& this.getSerieConcluida() == s.getSerieConcluida();
	}
}
