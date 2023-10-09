import java.util.Scanner;
public class Area {
	public static void main(String [] args) {
		Scanner ler = new Scanner (System.in);
		double l, a, area;
		
		System.out.println("Escreva o número da largura: ");
		l = ler.nextDouble();
		
		System.out.println("Escreva o número da altura: ");
		a = ler.nextDouble();
		
		area= l*a;
		System.out.println("A área é:"+ area );
		ler.close();
   }
}