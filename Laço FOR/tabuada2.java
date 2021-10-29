import java.util.Scanner; 
public class tabuada2 {

	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int N, I, R;
		
			System.out.println ("Entre com o número");
			N = in.nextInt();
			
			for (I=1; I<=10; I++) {
				R = N * I;
				System.out.println(N+"x"+I+" = " +R);
			}
		}
	}


