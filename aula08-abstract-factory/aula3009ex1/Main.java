package aula3009ex1;

public class Main {

	public static void main(String[] args) {
		// Usando fábrica de formas 2D
        FormaFactory fabrica2D = new Forma2DFactory();
        Forma f1 = fabrica2D.criarFormaA();
        Forma f2 = fabrica2D.criarFormaB();

        f1.desenhar();
        f2.desenhar();

        // Usando fábrica de formas 3D
        FormaFactory fabrica3D = new Forma3DFactory();
        Forma f3 = fabrica3D.criarFormaA();
        Forma f4 = fabrica3D.criarFormaB();

        f3.desenhar();
        f4.desenhar();

	}

}
