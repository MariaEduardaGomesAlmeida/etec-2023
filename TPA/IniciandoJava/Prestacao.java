import java.util.Scanner;
public class Prestacao {
	public static void main(String [] args) {
		double valor, taxa, tempo, prestacao;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva o valor: ");
		valor = ler.nextDouble();
		
		System.out.println("Escreva a taxa: ");
		taxa = ler.nextDouble();
		
		System.out.println("Escreva o tempo: ");
		tempo = ler.nextDouble();
		
		prestacao = valor + (valor*(taxa/100)*tempo);
		System.out.println("Escreva a prestação: " + prestacao);
		
		ler.close();
	}

}
