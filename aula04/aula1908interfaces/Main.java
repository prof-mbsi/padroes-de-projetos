package aula1908interface;

public class Main {

	public static void main(String[] args) {
		MotorGasolina mg = new MotorGasolina();
		MotorEletrico me = new MotorEletrico();
		
		Carro c1 = new Carro(me);
		Carro c2 = new Carro(mg);
		
		c1.ligarCarro();
		c2.ligarCarro();
	}

}
