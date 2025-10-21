package aula0710;

import java.util.ArrayList;
import java.util.List;

public class Post implements Assunto {
    private String titulo;
    private List<Observador> observadores = new ArrayList<>();

    public Post(String titulo) {
        this.titulo = titulo;
    }

    //Inscreve observador:
    public void adicionarObservador(Observador o) {
        observadores.add(o);
    }

    //Remove observador:
    public void removerObservador(Observador o) {
        observadores.remove(o);
    }

    public void notificarObservadores(String mensagem) {
    	//Notfica todos os observadores inscritos na lista:
        for (Observador o : observadores) {
            o.atualizar(mensagem);
        }
    }

    public void publicar() {
        System.out.println("Post publicado: " + titulo);
        //Chama a notificação assim que houver uma nova publicação:
        notificarObservadores("Novo post: " + titulo);
    }
}