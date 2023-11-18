import java.util.Scanner;
public class Media{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
				final int TAM = 10;
				float valor, soma=0, mediaVetor;
				int i, a[];
				
				a = new int [TAM];
				
				//leitura do vetor A
				for(i = 0; i <10; i++) {
					System.out.println("Entre com o "+(i+1)+"º valor:");
					a[i] = sc.nextInt();
				}
				
				//calculo
				for(i = 0; i <10; i++) {
					valor = a[i];
					soma = soma+valor;
				}
				
				//media
				mediaVetor = soma/10;
				
				//Apresentando a média
				System.out.println("A média dos dez valores apresentados é "+mediaVetor);
				
	}
	
}
