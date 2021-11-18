import java.util.Scanner;
public class ParEImpar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], i, contpar=0, contimpar=0;
		a = new int[20];
		//ler o vetor misturado
		for(i=0; i<20; i++) {
			System.out.println("Entre com o "+(i+1)+" numero");
			a[i] = in.nextInt();
			//verificando se é par ou ímpar
			if (a[i] % 2 == 0) {
				contpar++;
			}else {
				contimpar++;
			}
		}
		System.out.println("Pares = "+contpar+" Impares = "+contimpar);
		int par[], impar[];
		par = new int[contpar];
		impar = new int[contimpar];
		//povoando o vetor de par
		int ipar=0;
		int iimpar=0;
		for (i=0; i<20; i++) {
			if (a[i]%2 == 0) {
				par[ipar] = a[i];
				ipar++;
			}else {
				impar[iimpar] = a[i];
				iimpar++;
			}
		}
		
		System.out.println("");
		
		//apresentar os vetores
		//apresentando o vetor completo
		
		System.out.print("Todos os números digitados ");
		System.out.print("[");
		for(i=0; i<20; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
		System.out.println();
		//apresentando o vetor de par
		
		System.out.print("Par ");
		System.out.print("[");
		for (i=0; i<contpar; i++) {
			System.out.print(par[i]+" ");
		}
		System.out.print("]");
		
	  //apresentando o vetor de impar
	 
		System.out.print(" Impar ");
		System.out.print("[");
		for (i=0; i<contimpar; i++) {
			System.out.print(impar[i]+" ");
		}
		System.out.print("]");
		
	}

}

		

	


