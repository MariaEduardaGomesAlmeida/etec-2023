import java.util.Scanner;
public class ReajusteSalarial {
			public static void main (String [] args) {
				Scanner in = new Scanner (System.in);
				
				double salario, reajuste1, reajuste2, novoSalario1, novoSalario2;
				
				System.out.println("Insira o valor do seu salário:");
				salario = in.nextDouble();
				
				
				reajuste1 = (salario*5)/100;
				
				reajuste2 = (salario*3.5)/100;
				
				
				if (salario == 1212.00) {
					novoSalario1 = salario + reajuste1;
					System.out.println("Seu novo salário é " + novoSalario1 );}
				else {
					novoSalario2 = salario + reajuste2;
					System.out.println("Seu novo salário é " + novoSalario2);}
				
				in.close();
			}
	}
