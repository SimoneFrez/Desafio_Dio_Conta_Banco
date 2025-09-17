package contaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Por favor, digite o número da Agência:");
		int numeroAgencia = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Por favor, digite o número da Conta:");
		String numeroConta =  sc.nextLine();	
			
		System.out.println("Por favor, digite o nome do Cliente:");
		String nomeCliente = sc.nextLine();
		
		System.out.println("Por favor, digite o Saldo inicial: ");
		double saldo = sc.nextDouble();
		
		System.out.println("\nOlá " + nomeCliente + ", obrigado por criar sua conta em nosso banco, sua agência é " + numeroAgencia +
		", conta " + numeroConta + 
		" e seu saldo R$" + String.format("%.2f", saldo) + " já está disponível para saque.");
		
		sc.close();
		

	}

}
