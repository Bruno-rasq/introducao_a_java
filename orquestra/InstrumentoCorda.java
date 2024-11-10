package orquestra;

public abstract class InstrumentoCorda extends Instrumento {

	private int cordas;

	InstrumentoCorda(int cordas){
		this.cordas = cordas;
	}

	public int getNumeroDeCordas(){
		return this.cordas;
	}
}