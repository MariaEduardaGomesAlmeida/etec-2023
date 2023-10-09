import java.util.Scanner;
public class SalarioLiquido {
	public static void main(String [] args) {
	int nA;
	double nH, salarioBruto, salarioLiquido, percentInss, desconto;
	Scanner ler = new Scanner (System.in);
	
	System.out.println("Escreva o número de aulas dadas: ");
	nA = ler.nextInt();
	
	System.out.println("Escreva o número de horas de aulas: ");
	nH = ler.nextDouble();
	
	System.out.println("Escreva o percentual do INSS: ");
	percentInss = ler.nextDouble();
	
	salarioBruto = nA*nH;
	desconto = salarioBruto*percentInss/100;
	
	salarioLiquido = salarioBruto - desconto;
	System.out.println("O salário líquido é: " + salarioLiquido);
	
	ler.close();
	
  }

}
