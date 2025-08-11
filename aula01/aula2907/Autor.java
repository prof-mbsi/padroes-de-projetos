package aula2907;

public class Autor {
	
	private String nome;
	private String nacionalidade;
	
	//Getter e setters:
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	//Outros métodos:
	public void exibirDados() {
		System.out.println("Autor: " + this.nome 
				+", nacionalidade: " + this.nacionalidade);
	}
}
