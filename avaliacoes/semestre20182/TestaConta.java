package avaliacoes.semestre20182;

public class TestaConta {
	public static void main(String[] args) {

		ContaBancaria c1 = new ContaBancaria(0);

		System.out.println(c1.consultarSaldo());

		c1.Depositar(500);

		System.out.println(c1.consultarSaldo());

		c1.Saque(250);

		System.out.println(c1.consultarSaldo());
	}
}