package recuperacoes.av1part2;

class ContaBancaria {
	private float saldo;

	ContaBancaria(){
		this.saldo = 0.0f;
	}

	void consultaSaldo(){
		System.out.println("saldo: R$" + this.saldo);
	}

	void deposito(float valor){
		this.saldo += valor;
	}

	void saque(float valor){
		if(valor <= this.saldo){
			this.saldo -= valor;
		}
	}
}