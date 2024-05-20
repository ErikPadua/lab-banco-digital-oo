
public class Main {

	public static void main(String[] args) {
		Cliente erik = new Cliente();
		erik.setNome("Erik");
		
		Conta cc = new ContaCorrente(erik);
		Conta poupanca = new ContaPoupanca(erik);

		cc.depositar(1000);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
