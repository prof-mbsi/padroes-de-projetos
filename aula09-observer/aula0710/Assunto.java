package aula0710;

//Subject: Define métodos para que possa ser observado:
public interface Assunto {
    void adicionarObservador(Observador o);
    void removerObservador(Observador o);
    void notificarObservadores(String mensagem);
}