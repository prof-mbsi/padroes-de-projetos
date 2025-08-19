package aula1208exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Arquivo {

	public static void main(String[] args) {
		
		try {
			BufferedReader bf = new BufferedReader(
					new FileReader("dados.txt"));
			String linha = bf.readLine();
			System.out.println(linha);
			int num = Integer.parseInt(linha);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
	}

}
