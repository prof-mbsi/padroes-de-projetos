package aula1908;

public class Carro {
	
	private Motor motor;
	
	public Carro(Motor motor) {
		this.motor = motor;
	}
	
	public void ligarCarro() {
		motor.ligar();
	}

}
