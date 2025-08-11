package aula0508;

public class Proprietario {
	private String nome;
	private String habilitacao;
	private boolean autorizado;
	
	//Getters e setters:
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHabilitacao() {
		return habilitacao;
	}
	public void setHabilitacao(String habilitacao) {
		this.habilitacao = habilitacao;
	}
	public boolean isAutorizado() {
		return autorizado;
	}
	public void setAutorizado(boolean autorizado) {
		this.autorizado = autorizado;
	}
	
	//Outros métodos:
	public void exibirDados() {
		System.out.println("Proprietário: " + this.nome
				+ ", habilitação: " + this.habilitacao);
	}
}
