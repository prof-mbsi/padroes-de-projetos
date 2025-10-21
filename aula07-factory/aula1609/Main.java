package aula1609;

public class Main {

	public static void main(String[] args) {
		
		//Cria as 3 formas usando a factory: 
		
        Forma f1 = FormaFactory.criarForma("circulo");
        f1.desenhar();

        Forma f2 = FormaFactory.criarForma("quadrado");
        f2.desenhar();
        
        Forma f3 = FormaFactory.criarForma("triangulo");
        f3.desenhar();
	}

}
