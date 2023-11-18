import java.util.Scanner;
public class ex004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		final int TAM = 11;
		int a[], i;
		a = new int[TAM];
		
		
		
		for(i=0; i<TAM; i++) {
			a[i] = (2*2)*i;
		}
		
		
		//apresentando vetor A
		System.out.println("Vetor com expoente de base dois: ");
		System.out.print("A = [ ");
		for(i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
		
		
		
		
		sc.close();
	}
}
