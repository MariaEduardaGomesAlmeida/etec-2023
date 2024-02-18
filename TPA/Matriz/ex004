import java.util.Random;
import java.util.Scanner;
public class ex004 {
	public static void main(String[] args) {
		 Random in = new Random();
	     Scanner sc = new Scanner(System.in);
	     
		    int matriz[][] = new int[4][4];
	        int i, j, bingo=0, numero, rodadas=0;

	        
	        //preenchendo a matriz com valores aleatorios
	        for(i=0; i<4; i++){
	            for(j=0; j<4;j++){
	                matriz[i][j] = (int)(Math.random()*76);
	            }
	        }
	        
	        //imprimindo a matriz
	        for (i = 0; i < 4; i++) {
	            System.out.println();
	            System.out.print("[ ");
	            for (j = 0; j < 4; j++) {
	                System.out.print(matriz[i][j]+"  ");
	            }
	            System.out.print("]");
	        }
	        System.out.println();
	        
	        
	        while(bingo<16) {
	        	System.out.println("Entre com o número da sorte: ");
	        	numero = sc.nextInt();
	        	
	        	boolean estaNaMatriz = false;
	        	for(i=0; i<4; i++) {
	        		for(j=0; j<4; j++) {
	        			if(matriz[i][j] == numero) {
	        				estaNaMatriz = true;
	        				break;
	        			}
	        		}
	        	}
	        	
	        	if(estaNaMatriz == true) {
	        		System.out.println("Parabéns! O número "+numero+" existe na cartela");
	        		bingo++;
	        	}else if(estaNaMatriz == false) {
	        		System.out.println("O número "+numero+" não esta na matriz. Tente novamente!");
	        	}
	        	
	        	rodadas++;
	        	
	        }
	        
	        System.out.println("Bingo! Você demorou "+rodadas+" rodadas");
		
	}

}
