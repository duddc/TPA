package tomadadedecisãoencadeada;
import java.util.*;
public class Combustivel {
	public static void main (String []args ) {
		Scanner in = new Scanner (System.in);
		double km, capacidade, consumo;
		
		System.out.println("Digite a capacidade em litros do tanque de seu veiculo:");
		capacidade = in.nextInt();
		System.out.println("Escreva a distância percorrida:");
		km = in.nextInt();
		consumo = km/capacidade;
		
		if (consumo >= 10) {
		System.out.println("Seu carro é econômico");
		}else{
			System.out.println("Seu carro não é econômico");
		
		}
    }
}