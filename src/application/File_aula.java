package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File_aula {

	public static void main(String[] args) {

		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
		
		String path = "C:\\Users\\ferna\\OneDrive\\Área de Trabalho\\AulaJava\\out.txt";
		
		//new FileWriter(path, true) incrementa o arquivo
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
