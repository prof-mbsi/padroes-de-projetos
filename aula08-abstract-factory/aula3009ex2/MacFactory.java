package aula3009ex2;

public class MacFactory implements GUIFactory {
    public Botao criarBotao() {
        return new BotaoMac();
    }
    public Menu criarMenu() {
        return new MenuMac();
    }
    public Checkbox criarCheckbox() {
        return new CheckboxMac();
    }
}