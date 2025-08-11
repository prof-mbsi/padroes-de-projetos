package aula0508;

public class Estacionamento {
	
	private String filial;
	private Vaga[] vagas;
	
	public Estacionamento() {
		this.vagas = new Vaga[3];
	}
	
	//Gatters e setters:
	public String getFilial() {
		return filial;
	}
	public void setFilial(String filial) {
		this.filial = filial;
	}
	public Vaga[] getVagas() {
		return vagas;
	}
	public void setVagas(Vaga[] vagas) {
		this.vagas = vagas;
	}
	
	//Outros métodos:
	public void exibirOcupadas() {
		System.out.println("Método: exibirOcupadas()");
		for (int i = 0; i < vagas.length; i++) {
			if(vagas[i] != null) {
				if(vagas[i].isOcupada()) {
					System.out.println("Vaga: " + vagas[i].getNumero());
				}
			}
		}
	}
}
