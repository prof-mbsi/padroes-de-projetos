package aula2907;

public class FuncionarioHorista extends Funcionario{
	
	private double valorHora;
	private double quantidadeDeHoras;
	
	//Getters e setters:
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public double getQuantidadeDeHoras() {
		return quantidadeDeHoras;
	}
	public void setQuantidadeDeHoras(double quantidadeDeHoras) {
		this.quantidadeDeHoras = quantidadeDeHoras;
	}

	//Outros métodos:
	@Override
	public double calcularSalario() {
		return this.quantidadeDeHoras * this.valorHora;
	}

	@Override
	public void exibirDados() {
		System.out.println("Nome: " + this.nome
				+ ", matrícula: " + this.matricula
				+ ", valor da hora: " + this.valorHora
				+ ", quantidade de horas: " + this.quantidadeDeHoras
		);
	}

}
