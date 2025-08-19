package aula1208interfaces;

public class Retangulo implements Forma, Imprimivel {
	
	private double altura;
	private double largura;

	//Getters e setters:
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}

	//Outros métodos:
	@Override
	public double calcularArea() {
		return this.largura * this.altura;
	}
	@Override
	public void imprimir() {
		System.out.println("Isso é um retângulo.");
	}

}
