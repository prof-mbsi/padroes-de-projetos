package aula3009ex2;

public class Aplicacao {
    private Botao botao;
    private Menu menu;
    private Checkbox checkbox;

    public Aplicacao(GUIFactory factory) {
        botao = factory.criarBotao();
        menu = factory.criarMenu();
        checkbox = factory.criarCheckbox();
    }

    public void desenharUI() {
        botao.desenhar();
        menu.abrir();
        checkbox.selecionar();
    }
}