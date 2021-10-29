import java.util.*;
public class contagemRegressiva {
		
	public static void main (String [] args) throws InterruptedException{
		int i=10;
		
		do {
		System.out.println(i);
		i = i -1;
		Thread.sleep(1000);
		
	}while (i <11);
		System.out.println("FOGO!!");
}
}