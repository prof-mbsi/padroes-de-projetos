package aula3009ex1;

//Factory de objetos 3D: Preparada para retornar as instâncias de objetos 3D
public class Forma3DFactory implements FormaFactory {
    public Forma criarFormaA() {
        return new Esfera();
    }

    public Forma criarFormaB() {
        return new Cubo();
    }
}