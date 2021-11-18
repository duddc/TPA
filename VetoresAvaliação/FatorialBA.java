import java.util.Scanner;
public class FatorialBA {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[], b[], i, fatorial, numero;
		final int TAM = 15;
		a = new int [TAM];
		b = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+" número que queira o fatorial");
			a[i] = input.nextInt();
			
			fatorial = 1;
			
			for(numero = a[i]; numero>1; numero--) {
				fatorial = fatorial*numero;
				b[i] = fatorial;
			}
		}
		for(i=0;i<TAM;i++) {
			
			if(b[i]!=0) {
				System.out.println("O fatorial de "+a[i]+" é igual a "+b[i]+".");
				
			}else {
				System.out.println("O fatorial de "+a[i]+" é igual a 1.");
				
			}
		}
	}
}
		
		
		
		
	

