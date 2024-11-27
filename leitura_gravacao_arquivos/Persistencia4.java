package leitura_gravacao_arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Persistencia4 {
	public static void main(String[] args) throws IOException {

		String path = "leitura_gravacao_arquivos/persistencia.txt";
		File file = new File(path);
		FileWriter fw = new FileWriter(file, true);
		BufferedWriter bw = BufferedWriter(fw);
		PrintWriter pw = PrintWriter(bw);

		pw.println(".......");
		pw.println("aaaaaaa");
		pw.println("bbbbbbb");
		pw.println(".......");

		pw.close();

		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);

		String line = null;
		while((line.readline()) != null){
			System.out.println(line);
		}
		
	}
}