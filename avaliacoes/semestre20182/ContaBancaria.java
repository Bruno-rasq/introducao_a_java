package avaliacoes.semestre20182;

public class ContaBancaria {

	private double saldo;

	ContaBancaria(double saldo){
		this.saldo = saldo;
	}

	double consultarSaldo(){
		return this.saldo;
	}

	Boolean Depositar(double deposito){
		if(deposito >= 0){
			this.saldo += deposito;
			return true;
		}
		return false;
	}

	Boolean Saque(double saque){
		if(saque <= this.saldo){
			this.saldo -= saque;
			return true;
		}
		return false;
	}
}