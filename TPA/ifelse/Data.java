import java.util.Scanner;
public class Data {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int dia, mes, ano;
		
		System.out.println("Entre com dia: ");
		dia = ler.nextInt();
		
		System.out.println("Entre com mês: ");
		mes = ler.nextInt();
		
		System.out.println("Entre com ano: ");
		ano = ler.nextInt();
		
		
		if (dia > 31 || dia < 1 || (mes > 12 || mes < 1 ) || (ano < 1)) {
			System.out.println("Data Inválida");
		}
		else if(dia == 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10)) {
			dia = 1;
			mes++;
			ano = ano;
			System.out.println("Amanhã será: " + dia + "/" + mes + "/" + ano);
		}
		else if (dia <= 30 && dia >= 1 && ( mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10)) {
			dia++;
			mes = mes;
			ano = ano;
			System.out.println("Amanhã será: " + dia + "/" + mes + "/" + ano);
		}
		else if ( dia == 31 && (mes == 12)) {
			dia = 1;
			mes = 1;
			ano++;
			System.out.println("Amanhã será: " + dia + "/" + mes + "/" + ano);
		}
		else if (dia == 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
			dia = 1;
			mes++;
			ano = ano;
			System.out.println("Amanhã será: " + dia + "/" + mes + "/" + ano);
		}
		else if (dia < 30 && dia >= 1 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
			dia++;
			mes = mes;
			ano = ano;
			System.out.println("Amanhã será: " + dia + "/" + mes + "/" + ano);
		}else if (dia == 31 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
			System.out.println("Data inválida");
		}
		
		
		
		if (ano % 4 == 0 && (dia <= 28 && dia >= 1 && (mes == 2))) {
			dia++;
			mes = mes;
			ano = ano;
			System.out.println("Amanhã será: " + dia + "/" + mes + "/" + ano);
		}
		else if (ano % 4 == 0 && (mes == 2 && (dia == 29 ))) {
			dia = 1;
			mes++;
			ano = ano;
			System.out.println("Amanhã será: " + dia + "/" + mes + "/" + ano);
		}
		else if (ano % 4 != 0 && (mes == 2 && (dia == 28))) {
			dia = 1;
			mes = 3;
			ano = ano;
			System.out.println("Amanhã será: " + dia + "/" + mes + "/" + ano);
		}
		else if (ano % 4 != 0 && (dia > 28 && (mes == 2))) {
			System.out.println("Data inválida");
		}
		
		
		
	}

}
