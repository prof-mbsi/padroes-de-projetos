package aula1609;

public class FormaFactory {
	
	/**
	 * Implementação da Factory. O método static recebe o parâmetro e retorna
	 * o objeto criado com base nele, possibilitando:
	 *  a. Criação de objetos de forma centralizada
	 *  b. Não duplicação de código
	 *  c. Possibilidade de extender sem grandes alterações no código existente
	 * @param tipo
	 * @return
	 */
    public static Forma criarForma(String tipo) {
        if (tipo.equalsIgnoreCase("circulo")) {
            return new Circulo();
        } else if (tipo.equalsIgnoreCase("quadrado")) {
            return new Quadrado();
        } else if (tipo.equalsIgnoreCase("triangulo")) {
            return new Triangulo();
        }
        throw new IllegalArgumentException("Tipo de forma desconhecido.");
    }
}