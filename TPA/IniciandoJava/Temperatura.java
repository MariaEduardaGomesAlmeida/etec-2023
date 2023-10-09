import java.util.Scanner;
public class Temperatura {
       public static void main (String args[]) {
       	   
       int f, c;
       Scanner ler = new Scanner(System.in);
       
       System.out.println ("Insira a temperatura em Fahrenheit ");
       f = ler.nextInt();
       
       c = (f-32)*5/9;
       System.out.println ("Apresente a temperatura em Celsius: " + c);
       ler.close();   	   
       }
}
