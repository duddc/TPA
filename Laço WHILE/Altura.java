import java.util.Scanner;
public class Altura {

		public static void main(String[] args) {
			Scanner in = new Scanner (System.in);
			int i=0;
			double hPedro , hJoao;
			
			System.out.println("Digite a altura atual de Pedro em cm");
			hPedro = in.nextDouble();
			System.out.println("Digite a altura atual de João em cm");
			hJoao = in.nextDouble();
			
			while (hJoao < hPedro) {
			
				hPedro =  (hPedro+(2.5/100));
				hJoao =  (hJoao+(2/100));
				i = i+1;
		}
			System.out.println("Vai demorar " +i+ " anos para João ser mais alto que Pedro.");
	} 
}
