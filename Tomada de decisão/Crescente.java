package tomadadedecisãoencadeada;
import java.util.*;
public class Crescente {
	public static void main (String []args ) {
	   Scanner in = new Scanner (System.in);
	   int a,b,c;
	   
	   System.out.println("Digite o primeiro valor:");
	   a = in.nextInt();
	   System.out.println("Digite o segundo valor ");
	   b = in.nextInt();
	   System.out.println("Digite o terceiro valor valor ");
	   c = in.nextInt();
       
	   if (a > b) {
	   	  }if (b> c) {
		   System.out.println( +a+ +b+ +c);
		   }else if (a > c){
			   System.out.println( +a+ +c+ +b);
		   	   }else if (c>a){
		   		  System.out.println( +c+ +a+ +b);
		   	      }else if (b>c) {
		   	         }if (a>c) {
		   	          System.out.println(+b+ +a+ +c);
		   	          }else{
		   	        	System.out.println( +b+ " , " +c+ " e " +a);
		   	            } if (c> b){
		   	            	System.out.println( +c+ " , " +b+ " e " +a);
		   	        	    
in.close();

		   }
	   }       
	}
	
