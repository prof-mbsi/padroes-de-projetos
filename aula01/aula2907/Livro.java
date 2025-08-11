package aula2907;

public class Livro {
	
	private String titulo;
	private Autor autor;
	
	//Getters e setters:
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	//Outros métodos:
	public void exibirDados() {
		System.out.println("Livro: " + titulo 
				+ ", autor: " + autor.getNome());
	}
}
