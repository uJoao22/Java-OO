package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();

		contaDoPaulo.saldo = 100;
		System.out.println("Saldo inicial: "+contaDoPaulo.saldo);
		
		contaDoPaulo.deposita(50);
		System.out.println("Saldo após deposito: "+contaDoPaulo.saldo);
	}	
}
