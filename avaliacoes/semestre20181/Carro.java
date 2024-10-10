package avaliacoes.semestre20181;

class Carro {

	private String[] modelosAceitos = { "Logan 1.6", "Gol 1.0", "Celta 1.4", "Civic 2.0", "Corsa 1.0." };
	
	private String modelo;
	private float tipo_motor, quilometragem_atual, quilometragem_total;
	private float consumo_quilometros_por_litro;

	Carro(String modelo, float motor, float consumoPerLitro){
		this.setModelo(modelo, motor);
		this.setConsumoPerLitro(consumoPerLitro);
		this.quilometragem_atual = 0.0f;
		this.quilometragem_total = 0.0f;
	}

	//getters
	String getModelo(){
		return this.modelo;
	}

	float getTipoMotor(){
		return this.tipo_motor;
	}
	
	float getQuilometragemAtual(){
		return this.quilometragem_atual;
	}
	
	float getQuilometragemTotal(){
		return this.quilometragem_total;
	}
	
	float getConsumoPorLitros(){
		return this.consumo_quilometros_por_litro;
	}

	//setters
	public void setModelo(String modelo, float motor){
		
		String modeloMotor = modelo + " " + motor;
		Boolean found = false;
		
		for(int i = 0; i < this.modelosAceitos.length; i++){
			if(modeloMotor.equals(this.modelosAceitos[i])){
				found = true;
				break;
			}
		}

		if(found){
			this.modelo = modelo;
			this.setMotor(motor);
			
		} else {
			this.modelo = "Gol";
			this.setMotor(1.0f);
		}
	}

	public void setMotor(float motor){
		this.tipo_motor = motor;
	}

	public void setConsumoPerLitro(float consumo){
		if(consumo >= 0){
			this.consumo_quilometros_por_litro = consumo;
		} else {
			this.consumo_quilometros_por_litro = 0;
		}
	}

	public void setQuilometrosAtuais(float km){
		if(km >= 0){
			this.quilometragem_atual = km;
			this.setQuilometrosTotais();
		} else {
			this.zera_quilometragem_atual();
		}
	}

	private void setQuilometrosTotais(){
		this.quilometragem_total += this.quilometragem_atual;
	}

	//metodos
	public void zera_quilometragem_atual(){
		this.quilometragem_atual = 0;
	}

	public void avanca_quilometragem(float km){
		this.setQuilometrosAtuais(km);
	}

	public float consumo_em_litros(){
		return this.consumo_quilometros_por_litro * this.quilometragem_total;
	}

	@Override
	public String toString(){
		return "model:" + this.getModelo() + " motor:" + this.getTipoMotor() + 
			" consumo:" + this.getConsumoPorLitros() + "km/L" + " consumo total:" + this.consumo_em_litros() + " l/km\n" +
			"quilometragem total:" + this.getQuilometragemTotal() + " quilometragem atual:" + this.getQuilometragemAtual();
	}
	
}