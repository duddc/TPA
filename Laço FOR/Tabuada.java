import java.util.Scanner; 
public class Tabuada {

		public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int n, i, r;
		
			System.out.println ("Entre com o número");
			n = in.nextInt();
			
			for (i=1; i<=10; i++) {
				r = i*n;
				System.out.println(i+"x"+n+" = " +r);
			}
		}
	}


