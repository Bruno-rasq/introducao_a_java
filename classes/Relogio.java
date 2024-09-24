package classes;

public class Relogio {

	private int hora, minuto, segundo;

	Relogio(int h, int m, int s)
	{
		this.setHora(h);
		this.setMinuto(m);
		this.setSegundo(s);
	}

	//setters
	public void setHora(int h)
	{
		if(h >= 0 && h <= 23)
			this.hora = h;
		else
			this.hora = 0;
	}

	public void setMinuto(int m)
	{
		if(m >= 0 && m <= 59)
			this.minuto = m;
		else
			this.minuto = 0;
	}

	public void setSegundo(int s)
	{
		if(s >= 0 && s <= 59)
			this.segundo = s;
		else 
			this.segundo = 0;
	}


	//getters
	public int getHora()
	{
		return this.hora;
	}

	public int getMinuto()
	{
		return this.minuto;
	}

	public int getSegundo()
	{
		return this.segundo;
	}

	
	//setters para passagem de tempo.
	public void passaHora()
	{
		if(this.hora == 23)
			this.setHora(0);
		else
			this.hora++;
	}

	public void passaMinuto()
	{
		if(this.minuto == 59)
		{
			this.passaHora();
			this.setMinuto(0);
		}
		else
			this.minuto++;
			
	}

	public void passaSegundo()
	{
		if(this.segundo == 59)
		{
			this.passaMinuto();
			this.setSegundo(0);
		}
		else
			this.segundo++;
			
	}


	//getter para retornar o tempo.
	public String getTempo()
	{
		return this.hora + ":" + this.minuto + ":" + this.segundo;
	}
}