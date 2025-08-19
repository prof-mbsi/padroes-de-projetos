package aula1208interfaces;

public class Circulo implements Forma {
	
	private double raio;
	
	//Getters e setters:
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}

	//Outros métodos:
	@Override
	public double calcularArea() {
		return 3.1415 * raio * raio;
	}

}
