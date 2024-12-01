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

	private String FilePath = "trabalho2/servicostreaming.txt";
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
		for (int i = 0; i < catalogo.size(); i++) {
	        SerieTV serie = catalogo.get(i);
	        if (serie.equals(stv)) {
	            catalogo.remove(i);
	            return;
	        }
		}
	}

	public void removerSerieTV(String titulo, int ano) 
	{
	    for (int i = 0; i < catalogo.size(); i++) {
	        SerieTV serie = catalogo.get(i);
	        if (serie.getTitulo().equals(titulo) && serie.getAnoLancamento() == ano) {
	            catalogo.remove(i);
	            return;
	        }
	    }
	}

	public void listarSeriesTV()
	{
		int contador = 0;
		for(SerieTV serie: catalogo){
			System.out.println(serie.toString());
			System.out.println("------------------------");
			contador += 1;
		}

		if(contador == 0){ System.out.println("Nenhuma Serie disponivel no momento...");}
	}

	public void listarSeriesTV(String genero)
	{
		int contador = 0;
		for(SerieTV serie: catalogo){

			if(serie.getGenero().equals(genero)){
				System.out.println(serie.toString());
				System.out.println("------------------------");
				contador += 1;
			}
		}
		if(contador == 0){ System.out.println("Nenhuma Serie disponivel no momento...");}
	}

	public void listarSeriesTV(int ano)
	{
		int contador = 0;
		for(SerieTV serie: catalogo){
			if(serie.getAnoLancamento() == ano){
				System.out.println(serie.toString());
				System.out.println("------------------------");
				contador += 1;
			}
		}
		if(contador == 0){ System.out.println("Nenhuma Serie disponivel no momento...");}
	}

	
	//metodos de persistencia de dados CSV.
	void carregarDados()
	{
		try {
			File file = new File(this.FilePath);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			String linha = null;
			while((linha = br.readLine()) != null){
				SerieTV serie = new SerieTV();
				serie.setSerieTVCSV(linha);
				catalogo.add(serie);
			}

			br.close();
		} catch (IOException erro){ System.out.println(erro.getMessage()); }
	}

	void gravar()
	{
		try {
			File file = new File(this.FilePath);
			FileWriter fw = new FileWriter(file, false);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			for(SerieTV serie: catalogo){
				pw.println(serie.getSerieTVCSV());
			}

			pw.close();
			bw.close();
		} catch (IOException erro){ System.out.println(erro.getMessage()); }
	
	}
}