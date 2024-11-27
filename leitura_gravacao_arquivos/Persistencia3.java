package leitura_gravacao_arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOExeception;
import java.io.BufferedWriter;

public class Persistencia3 {
	public static void main(String[] args) {

		String caminho = "path.txt";
		File arquivo = new File(caminho);
		FileWriter escritor = new FileWriter(arquivo, true);
		BufferedWriter bw = new BufferedWriter(escritor);
		PrintWriter pw = new PrintWriter(bw);

		pw.println("ok");
		pw.close();
		escritor.close();

		System.out.println(file.exists());
	}
}