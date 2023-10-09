import java.util.Scanner;
public class Idade {
	public static void main(String [] args) {
		Scanner ler = new Scanner (System.in);
		int idade, anoNasci, anoAtual;
		String nome;
		
		System.out.println("Escreva o nome de uma pessoa: ");
		nome = ler.next();
		
		System.out.println("Escreva o ano atual: ");
		anoAtual = ler.nextInt();
		
		System.out.println("Escreva o ano de nascimento de " + nome + ": ");
		anoNasci = ler.nextInt();
		
		idade = anoAtual - anoNasci;
		System.out.println("A idade de " + nome + " é: " + idade);
		ler.close();
	}

}
