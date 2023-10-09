import java.util.Scanner;
public class MaiorMenor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade;
		String resposta;
		
		do {
			System.out.println("Digite sua idade: ");
			idade = sc.nextInt();
			
			if(idade>=18) {
				System.out.println("Você é maior de idade!");
			}else {
				System.out.println("Você é menor de idade!");
			}
			
			System.out.println("Deseja informar outra idade? Caso sim digite 's', caso não digite 'n' ");
			resposta = sc.next();
		}while(resposta.equalsIgnoreCase("s"));
	}

}
