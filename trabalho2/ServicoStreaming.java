package trabalho2;

import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;

public class ServicoStreaming {

	private String FilePath = "trabalho2/servicostreaming.csv";
	private ArrayList<SerieTV> catalogo = new ArrayList<>();

	ServicoStreaming(){}

	public void adicionarSerieTV(SerieTV serie)
	{
		for(SerieTV s: catalogo){
			if(s.equals(serie)){
				return;
			}
		}

		catalogo.add(serie);
	}

	public void removerSerieTV(SerieTV stv)
	{
		for(SerieTV s: catalogo){
			if(s.equals(stv)){
				catalogo.remove(s);
				return;
			}
		}
	}

	public void removerSerieTV(String titulo, int ano)
	{
		for(SerieTV serie: catalogo){
			if(serie.getTitulo().equals(titulo) && serie.getAnoLancamento() == ano){
				catalogo.remove(serie);
				return;
			}
		}
	}

	public void listarSeriesTV()
	{
		for(SerieTV serie: catalogo){
			System.out.println(serie.toString());
		}
	}

	public void listarSeriesTV(String genero)
	{
		for(SerieTV serie: catalogo){

			if(serie.getGenero().equals(genero)){
				System.out.println(serie.toString());
			}
		}
	}

	public void listarSeriesTV(int ano)
	{
		for(SerieTV serie: catalogo){
			if(serie.getAnoLancamento() == ano){
				System.out.println(serie.toString());
			}
		}
	}

	
	//metodos de persistencia de dados CSV.
	void carregarDados() throws IOException 
	{
		File file = new File(this.FilePath);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		String linha = null;
		while((linha = br.readLine()) != null){
			catalogo.add(new SerieTV().setSerieTVCSV(linha));
		}
	}

	void gravar()
	{
		File file = new File(this.FilePath);
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);

		for(SerieTV serie: catalogo){
			pw.println(serie.getSerieTVCSV());
		}

		pw.close();
		bw.close();
	}
}