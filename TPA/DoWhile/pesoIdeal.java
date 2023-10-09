import java.util.Scanner;
public class pesoIdeal {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 
		 String genero;
		 int altura, resposta;
		 double pesoIdeal;
		 
		do {
			 System.out.println("Qual o seu sexo? Responda com 'm' para masculino e 'f' para feminino.");
			 	genero = in.next();
			 	
			 System.out.println("Qual é a sua altura? ");
			 	altura = in.nextInt();
				 
				 if(genero.equalsIgnoreCase("m")){
					 pesoIdeal = 52 + (0.75*(altura - 152.4));
					 System.out.printf("Seu peso ideal é %.2f kg. ", pesoIdeal);
				 }else{
					 pesoIdeal = 52 + (0.67*(altura - 152.4));
					 System.out.printf("Seu peso ideal é %.2f kg. ", pesoIdeal);
				 }
				 
				 System.out.println("Deseja continuar a execução? (1-Sim ou 2-Não)"); 
				 	resposta = in.nextInt();
			 
		 }while(resposta == 1);
		 
	in.close(); 
	}
}