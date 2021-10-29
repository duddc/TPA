import java.util.Scanner;
public class altura {
	
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		int hmenor, hmaior, h, i;
		
		System.out.println ("Digite a primeira altura");
		h = in.nextInt();
		hmenor = h;
		hmaior = h;
		
		for (i =1; i < 5; i++){
			System.out.println ("Digite a altura");
			h = in.nextInt();
			
			if (h < hmenor){ 
				hmenor = h;
				}else {
				hmaior = h;
			}
		}
		System.out.println ("A maior altura é " +hmaior+ " e a menor altura é " +hmenor );
}
}
		

