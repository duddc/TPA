
public class numImpares {

	public static void main (String args []) {
		int i, num = 1;
		
		for (i=1 ; i <= 500; i++) {
			if (i % 3 == 0) {
				num = i;
				num = i + num;
				}else {}
			}
		System.out.println (+num);
}
}
