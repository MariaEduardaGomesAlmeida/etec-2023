import java.util.Scanner;
public class Invertido {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int TAM = 10;
		int i, a[], b[], j=TAM-1;
		
		a = new int [TAM];
		b = new int [TAM];
		
		//leitura do vetor A
		for(i = 0; i <10; i++) {
			System.out.println("Entre com o "+(i+1)+"º valor:");
			a[i] = sc.nextInt();
		}
		
		//imprimir vetor B
		for(i = 0; i <10; i++){
			b[j]= a[i];
			j--;
		}
		
		//apresentando o valor b
				System.out.print("B [] = "+"[ ");
				for(i = 0; i<10; i++) {
					System.out.print(b[i]+" ");
				}
				System.out.print("]\n");
		
		
		
	}

}
