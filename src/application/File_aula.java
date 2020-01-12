package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File_aula {

	public static void main(String[] args) {

		String path = "C:\\Users\\ferna\\OneDrive\\Área de Trabalho\\AulaJava\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
