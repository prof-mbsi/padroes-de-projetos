package aula0209;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Testando conexão com banco de dados Singleton:
		 */
		ConexaoBD c1 = ConexaoBD.getInstancia();
		c1.executarQuery("SELECT * FROM tabela");
		ConexaoBD c2 = ConexaoBD.getInstancia();
		c2.executarQuery("DROP TABLE tabela");
		System.out.println(c1 == c2);
		System.out.println();
		System.out.println("--- Objetos: ---");
		System.out.println(c1);
		System.out.println(c2);
		
		/*
		 * Testando log com Singleton:
		 */
		System.out.println();
		Logger logger = Logger.getInstancia();
		logger.log("Iniciando aplicação...");
		logger.log("Conexão estabelecida!");
	}

}
