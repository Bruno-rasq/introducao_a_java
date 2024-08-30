package exercicios;

// Desenvolva funções e/ou procedimentos para:
// Imprimir a Fibonacci. 
// Retornar o quadrado de um número
// Calcular o fatorial de um número
// Converter uma temperatura de graus Fahrenheit para Celsius
// Converter uma temperatura de graus Celsius para Fahrenheit

public class Exe05 {
	public static void main(String[] args){
		int n = 7;
		System.out.println("Fibonacci de " + n + " = " + fibonacci(n));
		System.out.println("quadrado de " + n + " = " + quadrado(n));
		System.out.println("fatorial de " + n + " = " + fatorial(n));

		fahToCel(96.8);
		celtoFah(0);
	}

	//fibonacci 
	public static int fibonacci(int n){
		if(n == 0) return 0;
		if(n == 1) return 1;

		int a = 0, b = 1, fib = 0;
		for (int i = 2; i < n + 1; i++){
			fib = b;
			int aux = a;
			a = b;
			b = a + aux;
		}
		return fib;
	}

	//quadrado de n 
	public static int quadrado(int n){
		return n * n;
	}

	//fatorial
	public static int fatorial(int n ){
		int resultado = n;
		for (int i = n - 1; i >= 1; i--){
			resultado *= i;
		}
		return resultado;
	}

	//Fahrenheit para Celsius
	static void fahToCel(double fahrenheit){
		//F - 32 / 1.8
		double celcius = (fahrenheit - 32) / 1.8;
		System.out.println(
			fahrenheit + "F -> " + celcius + "C"
		);
		
	}
	
	//Celsius para Fahrenheit
	static void celtoFah(double celcius){
		//C * 1.8 + 32
		double fahrenheit = (celcius * 1.8) + 32;
		System.out.println(
			celcius + "C -> " + fahrenheit + "F"
		);
		
	}
}