import java.util.Scanner;
public class Fatorial {
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int  num = 0, muti = 1;
	
		System.out.println("Digite um número inteiro positivo");
		num = in.nextInt();
		
		while (num > 1){
			muti = muti*num;
			num--;
		}
			System.out.println ("O fatorial  é " +muti);
	}
}