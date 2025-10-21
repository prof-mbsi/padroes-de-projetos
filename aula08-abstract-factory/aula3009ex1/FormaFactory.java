package aula3009ex1;

/**
 * Abstract Factory: Interface que permite a criação família de objetos 
 * de tipos parecidos.
 * 
 */
public interface FormaFactory {
    Forma criarFormaA();
    Forma criarFormaB();
}