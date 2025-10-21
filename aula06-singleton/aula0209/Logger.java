package aula0209;

public class Logger {
	
	private static Logger instancia;
	
	private Logger() {}
	
	public static Logger getInstancia() {
		if(instancia == null) 
			instancia = new Logger();
		return instancia;
	}
	
	public void log(String mensagem) {
		System.out.println("[LOG] " + mensagem);
	}

}
