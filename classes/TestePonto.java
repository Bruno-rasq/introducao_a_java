package classes;

public class TestePonto {
	public static void main(String[] agrs) {

		Ponto p = new Ponto(5, 5);

		System.out.println("x = " + p.x);
		System.out.println("y = " + p.y);

		p.move(10, 30);

		System.out.println("x = " + p.x);
		System.out.println("y = " + p.y);
	}
}