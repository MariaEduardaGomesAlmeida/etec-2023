import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade, anoAtual, anoNasc, velho, novo;
		
		System.out.println("Escreva seu ano de nascimento: ");
		anoNasc = sc.nextInt();
		
		System.out.println("Escreva o ano atual: ");
		anoAtual = sc.nextInt();
		
		idade = anoAtual - anoNasc;	
		
		System.out.println("Sua idade �: " + idade);
		
		
		velho = idade;
		novo = idade;
		
		for(int i = 2; i<=10; i++) {
			System.out.println("Escreva seu ano de nascimento: ");
			anoNasc = sc.nextInt();
			
			System.out.println("Escreva o ano atual: ");
			anoAtual = sc.nextInt();
			
			idade = anoAtual - anoNasc;
			
			System.out.println("Sua idade �: " + idade);
			
			if(idade < velho) {
				velho = idade;
			}else {
				novo = idade;
			}
			
		}
		
		System.out.println("O mais velho �: " + velho);
		System.out.println("O mais novo �: " + novo);
	}

}
