import java.util.*;
public class Potencia {

	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int base, expoente, potencia, muti, i=1;
		
		System.out.println("Digite o valor da base: ");
		base = in.nextInt();
		System.out.println("Digite o valor do expoente: ");
		expoente = in.nextInt();
		
		do {
			potencia = base*base;
			i++;
		}while (i <= expoente);
		System.out.println("A potência de " +base+ " é " +potencia);
	}
}


