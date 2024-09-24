package classes;

public class TestaRelogio {
	public static void main(String[] args) {

		Relogio r = new Relogio(23, 59, 57);

		System.out.println(
			r.getTempo()
		);

		r.passaSegundo();
		System.out.println(
			r.getTempo()
		);

		r.passaSegundo();
		System.out.println(
			r.getTempo()
		);

		r.passaSegundo();
		System.out.println(
			r.getTempo()
		);
	}
}