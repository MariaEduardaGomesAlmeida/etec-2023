import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int idade;
		String res;
		
		do{
			System.out.println("Informe a sua idade:");
			idade = in.nextInt();
			
			if(idade < 18) {
				System.out.println("MENOR de idade.");
			}else {
				System.out.println("MAIOR de idade.");
			}
			
			System.out.println("Deseja continuar? 's' para sim e 'n' para não.");
			res = in.next();
			
		}while(res.equalsIgnoreCase("s"));
		
		System.out.println("Fim do programa.");
		
		in.close();
	}

}
