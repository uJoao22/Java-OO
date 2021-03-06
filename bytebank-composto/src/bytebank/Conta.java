package bytebank;

public class Conta {
	private double saldo;
	int agencia;
	int numero;
	
	//Criando a referencia para o objeto Cliente
	Cliente titular;
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor; 
			return true;
		}
		return false;
	}
	
	public boolean transfere(double valor, Conta destino) {
		boolean res = saca(valor);
		if(res) {
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}	
}