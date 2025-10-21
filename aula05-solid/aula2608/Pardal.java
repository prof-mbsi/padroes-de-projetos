package aula2608;

public class Pardal extends Ave implements AveQueVoa{

	@Override
	public void voar() {
		System.out.println("Pardal voando...");
	}

	@Override
	public void exibir() {
		System.out.println("Sou um pardal!");
	}

}
