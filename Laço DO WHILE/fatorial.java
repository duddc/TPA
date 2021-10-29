import java.util.*;
public class fatorial {

	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int i=10, num, fatorial=1;
		
		System.out.println ("Digite o número desejado");
		num = in.nextInt();
		
		do {
			fatorial = fatorial*num;
			num--;
			
	}while (num > 1);
		System.out.println("O fatorial  é " +fatorial);
}
}

