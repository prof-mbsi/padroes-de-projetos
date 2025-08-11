package aula0508;

public class Main {

	public static void main(String[] args) {

		Veiculo v = new Veiculo();
		v.setPlaca("AAA0101");
		v.setMarca("Ford");
		v.setModelo("Ka");
		v.setAno(2006);
		
		Proprietario p = new Proprietario();
		p.setNome("Paulo");
		p.setHabilitacao("AB");
		p.exibirDados();
		p.setAutorizado(false);
		
		v.setProprietario(p);
		
		v.exibirDados();
		
		Vaga va = new Vaga();
		va.setNumero(1);
		va.exibirEstado();
		
		va.ocuparVaga(v);
		va.exibirEstado();
		
		Veiculo v1 = new Veiculo();
		v1.setPlaca("BBB0202");
		v1.setMarca("Renault");
		v1.setModelo("Sandero");
		v1.setAno(2010);
		v1.setProprietario(p);
		
		va.ocuparVaga(v1);
		va.exibirEstado();
		/*
		va.desocuparVaga();
		va.exibirEstado();
		
		va.desocuparVaga();
		va.exibirEstado();
		*/
		
		Vaga[] vs = new Vaga[3];
		vs[0] = va;
		vs[1] = new Vaga();
		vs[2] = new Vaga();
		
		Estacionamento e = new Estacionamento();
		e.setVagas(vs);
		e.exibirOcupadas();
		
	}
}
