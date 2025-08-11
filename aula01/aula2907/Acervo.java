package aula2907;

public class Acervo {
	
	private Livro[] livros;
	
	//Construtor:
	public Acervo() {
		this.livros = new Livro[3];
	}
	
	//Getters e setters:
	public Livro[] getLivros() {
		return livros;
	}	
	public void setLivros(Livro[] livros) {
		this.livros = livros;
	}
	
	//Outros métodos:
	public void exibirLivros() {
		//System.out.println(livros.length);
		
		for(int i = 0; i < this.livros.length; i++) {
			this.livros[i].exibirDados();
		}
		
	}

}
