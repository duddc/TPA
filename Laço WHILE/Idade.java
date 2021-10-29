import java.util.Scanner;
public class Idade {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i=1, idade, maior=0, menor=0;
		
		while (i<11) {
		System.out.println("Entre com a idade dos alunos");
		idade = in.nextInt();
		if (idade>=18) {
			maior++;
		}else {
			menor++;
		}
		i++;
		}	
		System.out.println(+menor+ " Alunos são menores de idade e " +maior+ " são maiores de idade");
	}
}