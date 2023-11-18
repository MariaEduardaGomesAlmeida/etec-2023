import java.util.Scanner;
public class ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int TAM = 10;
        int a[], b[], c[], i, j, k = 0, diferenca=0;
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
		
		
		//verificando diferenca dos vetores
	        for (i = 0; i < TAM; i++) {
	            boolean conjIguais = false;
	            for (j = 0; j < TAM; j++) {
	                if (a[i] == b[j]) {
	                    conjIguais = true;
	                }
	            }

	            if (conjIguais == false) {
	                diferenca++;
	            }
	        }
	        
	        
	    //preencher vetor C
	        c = new int[diferenca];

	        for (i = 0; i < TAM; i++) {
	            boolean conjIguais = false;

	            for (j = 0; j < TAM; j++) {
	                if (a[i] == b[j]) {
	                    conjIguais = true;
	                }
	            }

	            if (conjIguais == false) {
	                c[k] = a[i];
	                k++;
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
			
			
	        
	        
	        System.out.println("Os elementos que estão no vetor A, mas não estão no  vetor B são:");
			System.out.print("C = [ ");
			for(i=0; i<diferenca; i++) {
				System.out.print(c[i]+" ");
			}
			System.out.print("]");
			
	        
	        
	        
        
        
    }
}
