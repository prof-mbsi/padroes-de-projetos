package aula2608;

public class DescontoRegular implements RegraDeDesconto{

	@Override
	public double calcular(double valor) {
		return valor * 0.9;
	}

}
