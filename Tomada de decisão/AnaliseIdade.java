package tomadadedecisãoencadeada;
import java.util.*;
public class AnaliseIdade {
	public static void main (String []args ) {
		Scanner in = new Scanner (System.in);
		int id, aNasc, aAtual;
		
		System.out.println("Digite o ano de nascimento:");
		aNasc = in.nextInt();
		System.out.println("Digite o ano atual:");
		aAtual = in.nextInt();
		id = aAtual-aNasc;
		System.out.println("A idade é:" +id);
		if (id<10) {
			System.out.println("criança");
		} else if (id<18) {
			System.out.println("adolescente");
		} else if (id<60) {
			System.out.println("adulto");
		} else {
			System.out.println("idoso");
		}
	}	
}
