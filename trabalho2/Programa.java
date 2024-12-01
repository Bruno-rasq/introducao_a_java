package trabalho2;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args){

		ServicoStreaming DeBugStream = new ServicoStreaming();

		Scanner in = new Scanner(System.in);

		while(true){
			menu();

			int opcao = in.nextInt();
			switch (opcao){
				case 1: {}
				case 2: {}
				case 3: {}
				case 4: {}
				case 5: {}
				case 6: {}
				case 7: { return; }
				default: { break; }
			}
		}
	}

	public static void menu() 
	{
    System.out.print(
        "____________________________________________\n" +
        "                DebugStreaming\n" +
        "____________________________________________\n" +
        "    -- Escolha uma Opcao:\n" +
        "   1 - cadastrar nova Serie de TV.\n" +
        "   2 - alterar dados de uma serie de TV.\n" +
        "   3 - remover uma serie de TV.\n" +
        "   4 - listar series lancadas em determinado ano.\n" +
        "   5 - listar series de determinado genero.\n" +
        "   6 - listar todas as series de TV.\n" +
        "   7 - sair.\n"
    );
	}
}
