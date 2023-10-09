import java.util.Scanner;
public class ParImpar {
		public static void main (String [] args) {
			Scanner in = new Scanner (System.in);
		
			double n;
			System.out.println("Insira um número:");
			n = in.nextDouble();
			
			if (n%2 == 0) {
			System.out.println("O número é PAR.");}
			else {
			System.out.println("O número é ÍMPAR");}
		
			in.close();
	}
}

