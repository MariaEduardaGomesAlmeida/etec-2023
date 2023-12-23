import java.util.Random;
public class ex001 {
	public static void main(String[] args) {
		
		
		int matriz[][], i, j, dobro=1;
		matriz = new int [4][4];
		
		//Matriz
		for(i=0; i<4; i++) {
			for(j=0; j<4; j++) {
				matriz[i][j] = dobro*2;
				dobro++;
						
			}
		}
		
		
		//Apresentar matriz
		for(i=0; i<4; i++) {
			System.out.println();
			for(j=0; j<4; j++) {
				System.out.print("["+matriz[i][j]+"]");
			}
		}
	}
}
