import java.util.Scanner;
public class NumeroPlaca {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int p;
		
		System.out.println("Escreva o ultimo número da placa: ");
		p = ler.nextInt();
		
		switch(p) {
		    case 1:
		    case 2:
		    	System.out.println("O veículo não circula na Segunda-feira");
		    	break;
		    case 3:
		    case 4:
		    	System.out.println("O veículo não circula na Terça-feira");
		    	break;
		    case 5:
		    case 6:
		    	System.out.println("O veículo não circula na Quarta-feira");
		        break;
		    case 7:
		    case 8:
		        System.out.println("O veículo não circula na Quinta-feira");
		        break;
		    case 9:
		    case 0:
		    	System.out.println("O veículo nao circula na Sexta-feira");
		    	break;
		    default: 
		    	System.out.println("Número inválido");
		    	
		}
		
	}

}
