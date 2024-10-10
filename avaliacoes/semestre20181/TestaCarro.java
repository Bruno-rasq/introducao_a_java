package avaliacoes.semestre20181;


public class TestaCarro {
	public static void main(String[]  args){

		Carro c1 = new Carro("Logan", 1.6f, 10.0f);
		Carro c2 = new Carro("Uno", 1.0f, 10.0f);

		System.out.println(c1.toString());
		
		System.out.println(" ");
		
		System.out.println(c2.toString());

		c1.avanca_quilometragem(10);
		c2.avanca_quilometragem(10);
		c2.avanca_quilometragem(20);
		c1.avanca_quilometragem(20);
		c1.zera_quilometragem_atual();
		c1.avanca_quilometragem(10);
		c2.avanca_quilometragem(25);

		System.out.println(" ");
		if(c1.consumo_em_litros() > c2.consumo_em_litros()){
			System.out.println(c1.toString());
		} else {
			System.out.println(c2.toString());
		}
		
	}
}