package ListadeVetores;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		final int TAM = 10;
		int i, a[], b[], c[];
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ "o valor do vetor A");
			a [i] = leia.nextInt();
		}	
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ "o valor do vetor B");
			b [i] = leia.nextInt();
			c [i]= a[i]+ b[i];
		}
		System.out.print(" C = ");
		for (i=0; i<TAM; i++) {
			System.out.print(c[i]+" ");
		}
	}
}
//Ler um vetor A de 10 posições de inteiro, ler um vetor B com 10 posições de inteiro
//e apresentar o um vetor C que será a soma de A com B