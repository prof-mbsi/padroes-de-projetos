package aula0209;

public class ConexaoBD {
	
	private static ConexaoBD instancia;
	
	private ConexaoBD() {
		System.out.println("Conectando ao BD...");
	}
	
	public static ConexaoBD getInstancia() {
		if(instancia == null) {
			instancia = new ConexaoBD();
		}
		return instancia;
	}
	
	public void executarQuery(String sql) {
		System.out.println("Executando query: " + sql);
	}

}
