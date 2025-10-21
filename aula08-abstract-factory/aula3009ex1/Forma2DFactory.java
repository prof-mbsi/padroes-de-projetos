package aula3009ex1;

//Factory de objetos 2D: Preparada para retornar as instâncias de objetos 2D
public class Forma2DFactory implements FormaFactory {
    public Forma criarFormaA() {
        return new Circulo();
    }

    public Forma criarFormaB() {
        return new Quadrado();
    }
}