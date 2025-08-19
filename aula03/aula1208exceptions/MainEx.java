package aula1208exceptions;

public class Main {

	public static void main(String[] args) {
		
		int[] numeros = {1, 2, 3};
		
		try {
			System.out.println(numeros[1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Chegou aqui!");
		}
		
		String texto = null;
		try {
			System.out.println(texto.length());
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println(e.getClass());
		}
		
		int x = 0, y = 10;
		try {
			int resultado = y / x;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		String texto2 = "234r";
		try {
			int numero = Integer.parseInt(texto2);
			System.out.println("Número convertido: " + numero);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.println("Chegou aqui...");
	}

}
