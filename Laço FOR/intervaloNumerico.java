import java.util.Scanner;
public class intervaloNumerico {
	
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		int i, inter1 =0, inter2=0, inter3=0, inter4=0, num=0, quant;
		
		System.out.println("Digite a quantatidade de número que serão digitados ");
		quant = in.nextInt();
		
//		perguntar para a professora como que cria o teste logico da maneira que ela pediu (terminar quando for lido um número negativo)
		
		for (i=1; i<= quant; i++) {
			System.out.println("Digite um número ");
			num = in.nextInt();
		
			if (num <= 25)  {
				inter1 = inter1 + 1;
			}else if (num <= 50) {
				inter2 = inter2 + 1;
			}else if (num <= 75) {
				inter3 = inter3 + 1;
			}else{
				inter4 = inter4 + 1;
			}
		}
		System.out.println( +inter1+ " intervalo 1 ");
		System.out.println ( +inter2+ " intervalo 2 ");
		System.out.println( +inter3+ " intervalo 3 ");
		System.out.println ( +inter4+ " intervalo 4 ");
}
}
	
