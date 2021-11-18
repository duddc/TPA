import java.util.Scanner;
public class Primo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, i, resto=0, A[];
		final int TAM=10;
		A = new int[TAM];
		
		for (int j=0; j<10; j++) {
			resto=0;
			
			System.out.println("Entre com um número inteiro");
			A[j] = in.nextInt();
	
			for (i=1; i<=A[j]; i++) {
				if (A[j]%i == 0) {
					resto++;
				}
			} 
			
			if (resto > 2) {
				System.out.println("Não é primo");
			}else {
				System.out.println("É primo");
			}
		} 
	}
}
