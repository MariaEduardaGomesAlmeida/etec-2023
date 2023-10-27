import java.util.Scanner;
public class Soma {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			final int TAM = 10;
			int i, a[], b[], c[];
			a = new int[TAM];
			b = new int[TAM];
			c = new int[TAM];
			
			//laço para ler vetor A
			for(i = 0; i<TAM; i++) {
				System.out.println("Digite o "+(i+1)+"º valor de A:");
				a[i] = sc.nextInt();
			}
			//laço para ler vetor B
			for(i = 0; i<TAM; i++) {
				System.out.println("Digite o "+(i+1)+"º valor de B:");
				b[i] = sc.nextInt();
			}
			
			//apresentando o valor A
			System.out.print("A [] = "+"[ ");
			for(i = 0; i<TAM; i++) {
				System.out.print(a[i]+" ");
			}
			System.out.print("]\n");
			
			//laço apresentando b
			System.out.print("B [] = "+"[ ");
			for(i = 0; i<TAM; i++) {
				System.out.print(b[i]+" ");
				//Soma
				c[i]= a[i]+b[i];
			}
			System.out.print("]\n");
			
			
			//apresentando o valor C
			System.out.print("C [] = "+"[ ");
			for(i = 0; i<TAM; i++) {
				System.out.print(c[i]+" ");
			}
			System.out.print("]\n");
				
			
		}

	}

