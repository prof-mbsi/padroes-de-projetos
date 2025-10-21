package aula0710;

//ConcreteObserver
public class Usuario implements Observador {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void atualizar(String mensagem) {
        System.out.println("[" + nome + "] Recebido: " + mensagem);
    }
}