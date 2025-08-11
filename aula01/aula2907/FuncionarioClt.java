package aula2907;

public class FuncionarioClt extends Funcionario{
	
	private double salarioBase;
	private double gratificacao;
	
	//Getters e setters:
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getGratificacao() {
		return gratificacao;
	}
	public void setGratificacao(double gratificacao) {
		this.gratificacao = gratificacao;
	}

	//Outros métodos:
	
	@Override
	public double calcularSalario() {
		return this.salarioBase + this.gratificacao;
	}
	@Override
	public void exibirDados() {
		System.out.println("Nome: " + this.nome
				+ ", matricula:" + this.matricula
				+ ", salário: " + this.salarioBase
				+ ", gratificação: " + this.gratificacao);
	}

}
