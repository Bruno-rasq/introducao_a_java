package classes;

public class Ponto {
	float x, y;

	//constructor da classe
	Ponto(float x, float y){
		this.x = x;
		this.y = y;
	}

	void move(float dx, float dy){
		this.x += dx;
		this.y += dy;
	}
}