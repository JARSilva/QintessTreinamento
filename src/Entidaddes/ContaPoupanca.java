package Entidaddes;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(String agencia, int numero, double saldo, Cliente cliente, double limite) {
		super(agencia, numero, saldo, cliente, limite);
		
	}
	
	public void render() {
		this.setSaldo(this.getSaldo() * 1.05);
	}
	
}
