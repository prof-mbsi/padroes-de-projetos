package aula3009ex2;

public class Main {

	public static void main(String[] args) {

		GUIFactory factory;

        String sistema = "Mac"; // trocar para "Windows"

        if (sistema.equals("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }

        Aplicacao app = new Aplicacao(factory);
        app.desenharUI();

	}

}
