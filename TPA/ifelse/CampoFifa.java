import java.util.Scanner;
public class CampoFifa {
		public static void main (String [] args) {
			Scanner in = new Scanner (System.in);
			
			double l, a, area;
			System.out.println("Insira a langura do campo:");
			l = in.nextDouble();
			System.out.println("Insira a altura do campo:");
			a = in.nextDouble();
			
			area = a*l;
			System.out.println("A área do campo é "+ area + " m2");
			
			if (area >= 110) {
				System.out.println("O campo está no padrão FIFA.");}
			else {
				System.out.println("O campo não está no padrão FIFA.");}
			
			in.close();
		}
}
