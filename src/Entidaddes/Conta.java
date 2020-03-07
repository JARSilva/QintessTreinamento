package Entidaddes;

public class Conta {
	protected String agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	protected double limite;
	
	public Conta(String agencia, int numero, double saldo, Cliente cliente, double limite) {
		super();
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
		this.limite = limite;
	}
	
	



	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}





	public boolean sacar(double valor) {
		if(this.getSaldo() - (valor + 0.3) >= 0) {
			this.setSaldo(this.getSaldo() - (valor + 0.3));
		}else if(this.getSaldo() - (valor + 2.0) >= -this.getLimite()) {
			this.setSaldo(this.getSaldo() - (valor + 2.0));
		}else {
			System.out.println("Você não tem limite para isso");
			return false;
		}
		return true;
	}
	public void depositar(double valor) {
			this.setSaldo(valor + this.getSaldo());
	}
	public void transferir(double valor, Conta pagado) {
		if(this.sacar(valor))
			pagado.depositar(valor);
		
	}
	public void status() {
		System.out.println("Dono:"+ this.getCliente().getNome() +"\nAgencia: "+this.getAgencia()+"\nSaldo: "+ this.getSaldo());
	}
}
