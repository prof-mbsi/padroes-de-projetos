package aula1908;

public class Main {

	public static void main(String[] args) {
		
		Motor m1 = new Motor();
		
		Carro c1 = new Carro(m1);
		c1.ligarCarro();
		
		Carro c2 = new Carro(m1);
		c2.ligarCarro();
		
		Carro c3 = new Carro(m1);
		c3.ligarCarro();
		
		Carro c4 = new Carro(m1);
		c4.ligarCarro();
	}

}
