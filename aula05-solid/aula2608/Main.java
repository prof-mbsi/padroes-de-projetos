package aula2608;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * Exercício 1:
		 */
		System.out.println("--- Exercício 1 ---");
		GeradorDeRelatorio gr = new GeradorDeRelatorio();
		gr.gerarRelatorio();
		
		EnviadorDeEmail ee = new EnviadorDeEmail();
		ee.enviarPorEmail();
		
		GravadorDeDados gd = new GravadorDeDados();
		gd.salvarNoBD();
		System.out.println();
		
		/**
		 * Exercício 2:
		 */
		System.out.println("--- Exercício 2 ---");
		CalculadoraDeDesconto cd = new CalculadoraDeDesconto();
		DescontoVIP dv = new DescontoVIP();
		System.out.println(cd.calcular(dv, 100));
		System.out.println();
		
		/**
		 * Exercício 3:
		 */
		System.out.println("--- Exercício 3 ---");
		Pardal ap = new Pardal();
		Pinguim pi = new Pinguim();
		ap.voar();
		ap.exibir();
		pi.exibir();
		System.out.println();
		
		/**
		 * Exercício 4:
		 */
		System.out.println("--- Exercício 4 ---");
		Desenvolvedor dev = new Desenvolvedor();
		Gestor ge = new Gestor();
		dev.programar();
		dev.testar();
		ge.gerenciar();
		System.out.println();
		
		/**
		 * Exercício 5:
		 */
		System.out.println("--- Exercício 5 ---");
		PDFExportador pdfEx = new PDFExportador();
		CSVExportador csvEx = new CSVExportador();
		RelatorioService rs = new RelatorioService(pdfEx);
		rs.gerarRelatorio();

	}

}
