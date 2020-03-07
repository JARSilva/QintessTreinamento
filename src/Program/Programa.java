package Program;

import Entidaddes.Cliente;
import Entidaddes.Conta;
import Entidaddes.ContaCorrente;
import Entidaddes.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("João Afonso", 545445454, 47777777, "dindin");
		ContaCorrente conta1;
		conta1 = new ContaCorrente("Itau", 123, 0, cliente1, 2.0, 300);
		conta1.status();
		conta1.depositar(300.00);
		conta1.status();
		Conta conta2 = new Conta("Bradeco", 123213, 0, cliente1, 20);
		
		conta1.transferir(590, conta2);
		conta1.status();
		conta2.status();
	}

}
