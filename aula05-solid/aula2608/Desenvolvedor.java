package aula2608;

public class Desenvolvedor implements Programador, Testador{

	@Override
	public void testar() {
		System.out.println("Dev testando...");
	}

	@Override
	public void programar() {
		System.out.println("Dev programando...");
	}

}
