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
				System.out.println("Voc� � maior de idade!");
			}else {
				System.out.println("Voc� � menor de idade!");
			}
			
			System.out.println("Deseja informar outra idade? Caso sim digite 's', caso n�o digite 'n' ");
			resposta = sc.next();
		}while(resposta.equalsIgnoreCase("s"));
	}

}
