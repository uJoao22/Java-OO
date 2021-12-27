package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		//Quando o Java instancia objetos, todos seus atributos tem como padrão os valores zerados
		Conta primeiraConta = new Conta();
		System.out.println("Saldo da conta 1: "+primeiraConta.saldo);
		primeiraConta.saldo = 200;
		System.out.println("Saldo da conta 1: "+primeiraConta.saldo);
		primeiraConta.saldo += 100;
		System.out.println("Saldo da conta 1: "+primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		System.out.println("Saldo da conta 2: "+segundaConta.saldo);
		segundaConta.saldo = 300;
		System.out.println("Saldo da conta 2: "+segundaConta.saldo);
		
		System.out.println(segundaConta.agencia);
		System.out.println(segundaConta.numero);
		System.out.println(segundaConta.titular);
		
		primeiraConta.agencia = 146;
		segundaConta.agencia = 146;
		
		if (primeiraConta == segundaConta) {
			System.out.println("São a mesma conta");
		} else {
			System.out.println("Não são a mesma conta");
		}

		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}