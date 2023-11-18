import java.util.Scanner;
public class ex006 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int TAM = 10;
		int a[], b[], c[], i, j, k=0, contInterseccao=0;
		a = new int[TAM];
		b = new int[TAM];
		
		
		//lendo vetores
		for(i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"º valor do vetor A: ");
			a[i] = sc.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"º valor do vetor B: ");
			b[i] = sc.nextInt();
		}
		
		
		//verificar se ha interseccao
		for(i=0; i<TAM; i++) {
			for(j=0; j<TAM; j++) {
				if(a[i]==b[j]) {
					contInterseccao++;
				}
			}
		}
		
		c = new int[contInterseccao];
		
		for(i=0; i<TAM; i++) {
			for(j=0; j<TAM; j++) {
				if(a[i]==b[j]) {
					c[k] = a[i];
					k++;
				}
			}
		}
		
		
		//apresentando vetores
		System.out.print("A = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]\n");
		
		
		
		
		System.out.print("B = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]\n");
		
		
		
		
		System.out.println("Os elementos que contem intersecção são:");
		System.out.print("C = [ ");
		for(i=0; i<contInterseccao; i++) {
			System.out.print(c[i]+" ");
		}
		System.out.print("]");
		
		
		
		
	}

}
