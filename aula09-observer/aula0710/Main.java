package aula0710;

public class Main {
	
	public static void main(String[] args) {
		
		Post post = new Post("Padrão Observer em Java");

	    Usuario u1 = new Usuario("Alice");
	    Usuario u2 = new Usuario("Bob");

	    post.adicionarObservador(u1);
	    post.adicionarObservador(u2);

	    post.publicar();
		
	}

}
