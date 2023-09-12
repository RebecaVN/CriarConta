package Atividade3;

public class Conta {
	
	public int agencia;
	public int	conta;
	public String titular;
	public double saldo;
	static int totalConta = 1234;
	
	public Conta(int agencia, String titular) {
		
		this.agencia = agencia;
		this.titular = titular;
		this.conta = totalConta +1;
		totalConta++;
		
		System.out.println("----------------------------");
		System.out.println("Voçe acaba de criar uma conta para " + titular);
		System.out.println("Agência: " + agencia);
		System.out.println("Conta: " + conta);
		
	}
}
