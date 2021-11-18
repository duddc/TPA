import java.util.Scanner;
public class Tabuada {

	public static void main (String[] args) {
	Scanner in = new Scanner (System.in);
	int i, A[], r;
	A = new int [5];

			for (int j=0; j<5; j++) {
			System.out.println ("Entre com o número");
			A[j] = in.nextInt();
			
			System.out.println("");
			
			for (i=1; i<=10; i++) {
			r = i*A[j];
			System.out.println(i+"x"+A[j]+" = " +r);	
	    }
	   }
	 }
}