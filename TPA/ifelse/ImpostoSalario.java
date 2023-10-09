import java.util.Scanner; 
public class ImpostoSalario {
	public static void main (String arg []) {
		Scanner ler = new Scanner(System.in);
        
		double imposto, salario;
		
		System.out.println("Escreva seu salário: ");
		salario = ler.nextDouble();
		
		if (salario<1903.89) {
			imposto = 0;
		}else if (salario <= 2826.65){
			imposto = salario/100*7.5 - 142.80;
		}else if (salario <= 3751.05) {
			imposto = salario/100*15 - 354.80;
		}else if(salario <= 4664.68) {
			imposto = salario/100*22.5 - 636.13;
		}else {
			imposto = salario/100*27.5 - 869.36;
		}
		
		System.out.println("O imposto é de: " + imposto);
		ler.close();
	}
}
