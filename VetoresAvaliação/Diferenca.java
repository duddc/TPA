import java.util.Scanner;
public class Diferenca {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], i=0, b[], c[], j=0, k=0;
		boolean encontrado;
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		//povoando o vetor A
		for(i =0; i<TAM; i++) {
			System.out.println("Insira os elementos de A:");
			a[i] = in.nextInt();
		}
		
		System.out.println("   ");
		
		//povoando o vetor B
		for(j =0; j<TAM; j++) {
			System.out.println("Insira os elementos de B:");
			b[j] = in.nextInt();
		}
		
		
		//verificando se o elemento de A esta em B	
			for(i=0; i< TAM; i++) {
				encontrado = false;
				for(j=0; j<TAM; j++) {
					if(a[i] == b[j]) {
						encontrado = true;
					}
				}
				
				if(encontrado == false) {
					c[k] = a[i];
					k++;
				}
			}
			
			System.out.println("   ");
				
			//apresentacao de A, B e C
			System.out.print("A = ");
			for (i=0; i<TAM; i++) {
				System.out.print(a[i]+" ");
			}
			
			System.out.println();
			System.out.print("B = ");
			for (i=0; i<TAM; i++) {
				System.out.print(b[i]+" ");
			}
			System.out.println();
			System.out.print("C = ");
			for (i=0; i<TAM; i++) {
				System.out.print(c[i]+" ");
			}
		}
	}