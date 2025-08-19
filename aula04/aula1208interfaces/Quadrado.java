package aula1208interfaces;

public class Quadrado implements Forma {
	
	private double lado;
	
	//Getters e setters:
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return this.lado * this.lado;
	}

}
