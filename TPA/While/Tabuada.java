import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int i = 1, n, r;
		
		System.out.println("A tabuada de qual número você quer calcular? ");
		n = ler.nextInt();
		
		while (i<=10) {
			r = n*i;
			System.out.println(n + " x " + i + " = " + r );
			i++;
		}
	}

}
