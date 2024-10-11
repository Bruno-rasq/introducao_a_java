package avaliacoes.semestre20181;

public class TestaCinema {
	public static void main(String[] args) {
		Cinema cine = new Cinema(5);

		Filme Avengers = new Filme("Avengers", 16, "Acao");
		Filme panico = new Filme("Todo mundo em panico", 18, "Comedia");
		Filme titanic = new Filme("Titanic", 10, "Romance");
		Filme filmelixo = new Filme("sem titulo", 10, "Luta");

		Sessao S1 = new Sessao(Avengers, 1, 80, 14);
		Sessao S2 = new Sessao(panico, 2, 90, 16);
		Sessao S3 = new Sessao(titanic, 3, 75, 18);
		Sessao S4 = new Sessao(filmelixo, 4, 100, 20);

		cine.AdicionarSessao(S1);
		cine.AdicionarSessao(S2);
		cine.AdicionarSessao(S3);
		cine.AdicionarSessao(S4);

		cine.verSessoes();
	}
}