package bytebank;


public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	
	//Criando a referencia para o objeto Cliente
	private Cliente titular;
	
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

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}	
	
	public Cliente getTitular() {
		return titular;
	}
}