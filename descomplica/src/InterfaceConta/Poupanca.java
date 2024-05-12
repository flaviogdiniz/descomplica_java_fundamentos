package InterfaceConta;

public class Poupanca implements Conta {
	
	private double saldo;

	@Override
	public void depositar(double valor) {
		this.saldo = valor + this.saldo;
		
	}

	@Override
	public void sacar(double valor) {
		this.saldo = this.saldo - valor;
		
	}

	@Override
	public double getSaldo() {
		return this.saldo;
		
	}

}
