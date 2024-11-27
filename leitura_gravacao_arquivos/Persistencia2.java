package leitura_gravacao_arquivos;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOExeception;

public class Persistencia2 {
	public static void main(String[] args) throws IOException {

		String path = "c://home/Desktop/.../arquivo.txt";
		File file = new File(path);
		PrintWriter pw = new PrintWriter(file);

		pw.println(true);
		pw.println("testando...");
		pw.println(2 + 2);
		pw.printf("String %s | Double %.2f | Inteiro %5d", "aaa", 10.5f, 5);

		pw.close();
	}
}