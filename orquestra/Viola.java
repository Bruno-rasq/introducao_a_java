package orquestra;

public class Viola extends InstrumentoCorda {

	Viola(){
		super(5);
	}
	
	Viola(int cordas){
		super(cordas);
	}

	@Override
	public void tocar(){
		System.out.println("tocando viola...");
	}
}