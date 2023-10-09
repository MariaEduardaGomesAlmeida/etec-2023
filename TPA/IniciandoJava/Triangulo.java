import java.util.Scanner;
public class Triangulo {
      public static void main (String args[]) {
            Scanner ler= new Scanner (System.in);  
            double b, h, area;
            System.out.println ("Entre com a base do triângulo:");
    		b=ler.nextDouble();
    		
    		System.out.println ("Entre com a altura do triângulo:");
    		h= ler.nextDouble();
    		
    		area=(b*h)/2;
    		System.out.println("A área do triângulo é "+area);
    		ler.close();
}
}