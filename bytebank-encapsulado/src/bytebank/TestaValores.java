package bytebank;

public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(123123);
		

		Conta conta2 = new Conta(1337, 12246);
		
		System.out.println("O total de contas criadas foi de: "+Conta.getTotal());
	}
}