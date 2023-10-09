public class Altura {
	public static void main (String [] args) {
		
		int pedro = 145, ano = 1;
		float joao = 134;
		
		while( joao <= pedro) {
			joao += 2.5;
			pedro += 2;
			ano ++;
		}
		System.out.println("Demorará "+ano+" anos para João ficar mais alto que Pedro.");
	}
}
