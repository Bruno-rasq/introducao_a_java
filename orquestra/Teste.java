package orquestra;

//javac orquestra/*.java
//java orquestra.Teste

public class Teste {
	public static void main(String[] args){

		
		Viola v = new Viola();
		Guitarra g = new Guitarra(6);
		Baixo b = new Baixo();

		g.tocar();
		b.tocar();
		v.tocar();
		

		Instrumento[] orquestra = new Instrumento[3];
		orquestra[0] = new Viola();
		orquestra[1] = new Guitarra();
		orquestra[2] = new Baixo();

		for(Instrumento instrumento: orquestra){
			instrumento.tocar();
		}
	}
}