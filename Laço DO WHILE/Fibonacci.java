import java.util.*;
public class Fibonacci {

	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int i=1, n, a=0, b=1, c=1;
		
		System.out.println("Escreva a quantidade de termos: ");
		n = in.nextInt();
		do {
			System.out.println(""+c+"");
			c=a+b;
			a=b;
			b=c;
			i++;
		}while (i <=n);
	}
}
