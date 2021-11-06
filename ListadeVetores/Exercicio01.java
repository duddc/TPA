package ListadeVetores;
import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		final int TAM = 10;
		int i, a[], b[];
		a = new int [TAM];
		b = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ "o valor do vetor A");
			a [i] = leia.nextInt();
			b [i]= a[i]*a[i];
		}	
		System.out.print("a = [ ");
		for (i=0; i<TAM; i++) {
			System.out.print(b[i]+ " ");
		}
		System.out.print( "] ");
	}
}

//Criar um programa que leia um vetor A com 10 posições de inteiro e
//imprima na tela um vetor b sendo que cada elemento de B seja o quadrado de A