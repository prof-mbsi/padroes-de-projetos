package aula2608;

public class DescontoVIP implements RegraDeDesconto{

	@Override
	public double calcular(double valor) {
		return valor * 0.8;
	}

}
