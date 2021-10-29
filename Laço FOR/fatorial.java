import java.util.Scanner;
public class fatorial {

		public static void main (String [] args) {
			Scanner in = new Scanner (System.in);
			int i=10, num, fatorial=1;
			
			System.out.println ("Digite o número desejado");
			num = in.nextInt();
			
			for (i=10; num >1; num--) {
				fatorial = fatorial*num;
			};
			System.out.println("O fatorial  é " +fatorial);
	}
	}