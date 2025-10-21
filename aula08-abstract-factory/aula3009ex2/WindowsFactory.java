package aula3009ex2;

public class WindowsFactory implements GUIFactory {
    public Botao criarBotao() {
        return new BotaoWindows();
    }
    public Menu criarMenu() {
        return new MenuWindows();
    }
    public Checkbox criarCheckbox() {
        return new CheckboxWindows();
    }
}
