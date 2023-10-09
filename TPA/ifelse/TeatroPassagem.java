import java.util.Scanner; 
public class TeatroPassagem {
		public static void main (String arg []) {
				Scanner in = new Scanner (System.in);
		
		double ingresso, ingressoDesconto;
		String resposta; 
		
		System.out.println("Insira o valor do ingresso, please");
		ingresso = in.nextDouble();
		
		System.out.println("Você é um estudante?");
		resposta = in.next();
		
		if(resposta.equalsIgnoreCase("sim")) {
			ingressoDesconto = (ingresso*50)/100;
			System.out.println("O preço do ingresso é " + ingressoDesconto);
				
		}
		else {
			System.out.println("O valor do ingresso é " + ingresso);
		}
			
		in.close();
			
		}
}
