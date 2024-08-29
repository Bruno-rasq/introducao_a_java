package condicionais;

public class Elseif {
	public static void main (String[] args){

		int a = 5;
		int b = 5;

		if ((a + b) >= 11){
			System.out.println("a + b >= 11");
			
		} else if ((a + b) == 10){
			System.out.println("a + b == 10");
			
		} else {
			System.out.println("a + b <= 10");
			
		}
	}
}