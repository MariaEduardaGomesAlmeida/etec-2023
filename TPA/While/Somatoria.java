public class Somatoria {
	public static void main(String[] args) {
		int i = 1, r = 0, n;
		
		while (i<=100) {
			n = r;
			r = i + r;
			System.out.println(i + " + " + n + " = " + r );
			i++;
		}
		
	}

}
