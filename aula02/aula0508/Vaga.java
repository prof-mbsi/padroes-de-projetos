package aula0508;

public class Vaga {
	
	private int numero;
	private Veiculo veiculo;
	private boolean ocupada;
	
	//Getters e setters:
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public boolean isOcupada() {
		return ocupada;
	}
	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}
	
	//Outros métodos:
	public void exibirEstado() {
		if(this.ocupada) {
			System.err.println("Vaga " + this.numero
					+ " está ocupada!");
		} else {
			System.out.println("Vaga " + this.numero
					+ " está desocupada!");
		}
	}
	public void ocuparVaga(Veiculo v) {
		if(v.getProprietario().isAutorizado()) {
			if(!this.ocupada) {
				this.veiculo = v;
				this.ocupada = true;
			} else {
				System.err.println("Não é possível ocupar a vaga!");
			}
		} else {
			System.err.println("Proprietário não autorizado!");
		}
	}
	public void desocuparVaga() {
		if(this.ocupada) {
			this.veiculo = null;
			this.ocupada = false;
		} else {
			System.err.println("Não é possível desocupar a vaga!");
		}
	}
}
