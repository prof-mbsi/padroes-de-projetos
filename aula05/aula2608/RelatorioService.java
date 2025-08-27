package aula2608;

public class RelatorioService {
	
	private Exportador ex;
	
	public RelatorioService(Exportador exportador) {
		this.ex = exportador;
	}
	
	public void gerarRelatorio() {
		System.out.println("Gerando relatório...");
		this.ex.exportar();
	}

}
