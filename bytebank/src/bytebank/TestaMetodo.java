package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();

		contaDoPaulo.saldo = 100;

		contaDoPaulo.deposita(50);
		System.out.println("Saldo do Paulo após deposito: "+contaDoPaulo.saldo);
		
		contaDoPaulo.saca(20);
		System.out.println("\nSaldo do Paulo após o saque: "+contaDoPaulo.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		if(contaDaMarcela.transfere(300, contaDoPaulo))
			System.out.println("\n\nTransferencia efetuada com sucesso!");
		else
			System.out.println("\nSaldo insuficiente");
			
		System.out.println("\nSaldo da Marcelo após transferencia: "+contaDaMarcela.saldo);
		System.out.println("\nSaldo do Paulo após transferencia: "+contaDoPaulo.saldo);
	}	
}
