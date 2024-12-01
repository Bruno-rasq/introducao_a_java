package trabalho2;

import java.util.Scanner;

public class Programa {
	
	public static ServicoStreaming DeBugStream = new ServicoStreaming();
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args){

		DeBugStream.carregarDados();

		while(true){
			menu();

			int opcao = in.nextInt();
			switch (opcao){
					
				case 1: { cadastrarNovaSerieTV(); 			break; }
				case 2: { alterarDadosSerieTV();  			break; }
				case 3: { removerSerieTvDoStreaming();  	break; }
				case 4: { listarSeriesPorAnoLancamento();   break; }
				case 5: { listarSeriesPorGenero(); 			break; }
				case 6: { listarTodasAsSeriesTV(); 			break; }
				case 7: { sair(); 							return; }
					
				default: { break; }
			}
		}
	}

	public static void menu() 
	{
	    System.out.print(
	        "____________________________________________\n" +
	        "                DebugStreaming\n" +
	        "____________________________________________\n" +
	        "    -- Escolha uma Opcao:\n" +
	        "   1 - cadastrar nova Serie de TV.\n" +
	        "   2 - alterar dados de uma serie de TV.\n" +
	        "   3 - remover uma serie de TV.\n" +
	        "   4 - listar series lancadas em determinado ano.\n" +
	        "   5 - listar series de determinado genero.\n" +
	        "   6 - listar todas as series de TV.\n" +
	        "   7 - sair.\n"
	    );
	}

	public static void cadastrarNovaSerieTV()
	{
		System.out.println("------------------------");
		System.out.println(" Adicionando nova serie.");
		System.out.println("------------------------");

		System.out.println("titulo: ");
		String titulo = in.nextLine();

		System.out.println("genero: ");
		String genero = in.nextLine();

		System.out.println("ano de lancamento: ");
		int ano = in.nextInt();

		System.out.println("temporada atual:");
		int temporada = in.nextInt();

		System.out.println("status concluid0: (true ou false)");
		boolean concluida = in.nextBoolean();

		SerieTV serie = new SerieTV(titulo, genero, ano, temporada, concluida);

		DeBugStream.adicionarSerieTV(serie);
	}
	
	public static void alterarDadosSerieTV()
	{
		System.out.println("sem implementacao ainda...");
	}
	
	public static void removerSerieTvDoStreaming()
	{
		System.out.println("Insira titulo da serie: ");
		String titulo = in.nextLine();

		System.out.println("Insira o ano: ");
		int ano = in.nextInt();

		DeBugStream.removerSerieTV(titulo, ano);
	}
	
	public static void listarSeriesPorAnoLancamento()
	{
		System.out.println("Selecione o ano de lancamento: ");
		int ano = in.nextInt();

		DeBugStream.listarSeriesTV(ano);
	}
	
	public static void listarSeriesPorGenero()
	{
		System.out.println("Selecione um genero: (Drama, ficcao, comedia, Romance)");
		String genero = in.nextLine();

		DeBugStream.listarSeriesTV(genero);
	}
	
	public static void listarTodasAsSeriesTV()
	{
		DeBugStream.listarSeriesTV();
	}
	
	public static void sair()
	{
		DeBugStream.gravar();
		in.close();
	}
}
