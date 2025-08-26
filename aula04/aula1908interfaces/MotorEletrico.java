package aula1908interface;

public class MotorEletrico implements Motor{

	@Override
	public void ligar() {
		System.out.println("Motor elétrico ligou!");
	}

}
