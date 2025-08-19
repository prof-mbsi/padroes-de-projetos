package aula1208interfaces;

public class Main {

	public static void main(String[] args) {
		
		Relatorio r = new Relatorio();
		r.imprimir();
		
		Retangulo re1 = new Retangulo();
		re1.setAltura(4.5);
		re1.setLargura(6.5);
		System.out.println("Área do Retângulo: " + re1.calcularArea());
		
		Circulo c1 = new Circulo();
		c1.setRaio(4.5);
		System.out.println("Área do Círculo: " + c1.calcularArea());
		
		Quadrado q1 = new Quadrado();
		q1.setLado(4.5);
		System.out.println("Área do Quadrado: " + q1.calcularArea());
		
		re1.imprimir();

	}

}
