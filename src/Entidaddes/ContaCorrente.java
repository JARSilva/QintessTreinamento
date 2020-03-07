package Entidaddes;

public class ContaCorrente extends Conta{
	private double valorTaxa;
	
	public ContaCorrente(String agencia, int numero, double saldo, Cliente cliente, Double vTaxa, double limite) {
		super(agencia, numero, saldo, cliente, limite);
		this.valorTaxa = vTaxa;
	}
	
	public double getValorTaxa() {
		return valorTaxa;
	}

	public void setValorTaxa(double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}
	
	public void pagarTaxa() {
		if(getSaldo() - this.getValorTaxa() > 0) {
			this.setSaldo(getSaldo() - this.getValorTaxa());
			System.out.println("Taxa paga");
		}else {
			System.out.println("Não é possivel pagar");
		}
	}
}
