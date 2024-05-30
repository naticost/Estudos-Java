public class Main {

	public static void main(String[] args) {
		Cliente Natiele = new Cliente();
		Natiele.setNome("Natiele");
		
		Conta cc = new ContaCorrente(Natiele);
		Conta poupanca = new ContaPoupanca(Natiele);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}