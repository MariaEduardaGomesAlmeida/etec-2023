import java.util.Scanner;
public class LojaDeAnimais {
       public static void main  (String args []) {
       
       double numCoelhos, custo;
       Scanner ler = new Scanner (System.in);
    		   
       numCoelhos = ler.nextDouble();
       System.out.println ("Escreva a quantidade de coelhos: ");
       
       custo = (numCoelhos*0.70)/18+10;
       System.out.println ("Apresente o custo: " + custo);
       ler.close();
       
       }
}
