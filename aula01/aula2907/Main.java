package aula2907;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("olá!");
		
		Produto p = new Produto();
		p.setNome("Água");
		p.setPreco(3.5);
		p.setQuantidade(15);
		
		p.exibirDados();
		
		Produto p2 = new Produto("Café", 28.5, 3);
		p2.exibirDados();
		
		Autor a1 = new Autor();
		a1.setNome("José");
		a1.setNacionalidade("Brasileiro");
		a1.exibirDados();
		
		Livro l1 = new Livro();
		l1.setTitulo("Primeiro livro");
		l1.setAutor(a1);
		
		Livro l2 = new Livro();
		l2.setTitulo("Segundo livro");
		l2.setAutor(a1);
		
		Livro l3 = new Livro();
		l3.setTitulo("Terceiro livro");
		l3.setAutor(a1);
		
		Livro[] livrosDoAcervo = new Livro[3];
		livrosDoAcervo[0] = l1;
		livrosDoAcervo[1] = l2;
		livrosDoAcervo[2] = l3;
		
		System.out.println("---");
		Acervo acervo = new Acervo();
		acervo.setLivros(livrosDoAcervo);
		acervo.exibirLivros();
	}

}
