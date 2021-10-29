
public class Conversao {
	public static void main (String args []) {
		
		int euro,dolar,reais, conver1, conver2; //coloquei a variavel como inteira. para um maior entendimento do resultado, por conta disso é um valor aproximado
		
		euro=7; 
		dolar=6;
		reais=104;
		
		conver1=reais/euro;
		conver2=reais/dolar;
		
		System.out.println ("O valor " +reais+ " reais, equivale " +conver1+ " euros e " +conver2+ " dolares");
	
	}
}

