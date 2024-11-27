package leitura_gravacao_arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Persistencia {
	public static void main(String[] args) throws IOException {

		/*
		metodos da classe File
		
		– boolean mkdir() 
		– boolean canRead() 
		– boolean canWrite() 
		– boolean exists() 
		– boolean isFile() 
		– boolean isDirectory() 
		– String delete() 
		– String getPath()
		*/

		String path = "cd://Desktop/.../Persistencia.txt";
		File file = new File(path);

		System.out.println(file.exists());

		//recebe no construtor uma string (path) e um boolean indicando se o arquivo é para leitura ou manipulação.
		FileWriter writer = new FileWriter("saida.txt", true);
		FileWriter fw = new FileWriter(file, true);
		fw.write("testando.../n");
		fw.close();


		/*
		metodos da class PrintWriter:
		
		- print
		- println
		- printf
		*/
		PrintWriter pw = new PrintWriter(fw);
		PrintWriter pw2 = new PrintWriter(new FileWriter("teste.txt", true));

		pw.println("testando print writer");
		pw.close();

		
	}
}