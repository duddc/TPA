package teste;

import java.util.Scanner;
public class CresentVetor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[], b[], i, ib, j, x;
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		
		for(i=0; i<TAM; i++) {
		System.out.println("Digite um numero:");
		a[i] = input.nextInt();
		b[i] = a[i];
		}
		
		for(i=0; i<TAM-1; i++) {
			ib = i;
			
			for(j=i+1; j<TAM; j++) {
				if(b[j]< b[ib]) {
					ib = j;
				}
			}
			
			x = b[i];
			b[i]  = b[ib];
			b[ib] = x;
		}	
		
		System.out.println(   );
		
		for(i=0; i<TAM; i++) {
			System.out.println(b[i]);
	}
} 
}