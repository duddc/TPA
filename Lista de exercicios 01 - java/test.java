import java.util.Scanner;
public class test {
	
	public static void main (String args []){
	
Scanner input = new Scanner(System.in);

int n1,n2,n3,soma,media;

System.out.println("Insira a 1° nota do aluno: ");
n1=input.nextInt();

System.out.println("Insira a 2° nota do aluno: ");
n2=input.nextInt();

System.out.println("Insira a 3° nota do aluno: ");
n3=input.nextInt();

soma=n1+n2+n3;
media=soma/3;

System.out.println("A média do aluno é: " +media);

input.close();
	}
}
