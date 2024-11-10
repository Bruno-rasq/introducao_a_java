package orquestra;

public class Guitarra extends InstrumentoCorda {

	Guitarra(){
		super(6);
	}

	Guitarra(int cordas){
		super(cordas);
	}

	@Override
	public void tocar(){
		System.out.println("tocando guitarra");
	}
}