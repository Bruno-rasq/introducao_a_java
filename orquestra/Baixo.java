package orquestra;

public class Baixo extends InstrumentoCorda {

	Baixo(){
		super(4);
	}

	Baixo(int cordas){
		super(cordas);
	}

	@Override
	public void tocar(){
		System.out.println("tocando baixo...");
	}
}