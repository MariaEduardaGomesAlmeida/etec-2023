import java.util.Scanner;
public class CampoFutebol {
	public static void main(String [] args){
		Scanner ler = new Scanner(System.in);
		double c, l, area;
		
		System.out.println("Escreva a largura da quadra: ");
		l = ler.nextDouble();
		
		System.out.println("Escreva  comprimento da quadra: ");
		c = ler.nextDouble();
		
		area = l*c;
		if(area >= 110) {
			System.out.println("Esta no padrão FIFA");
		}else {
			System.out.println("Esta fora do padrão FIFA");
		}
		
		ler.close();
	}

}
