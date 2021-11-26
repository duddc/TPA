public class PotencialIndexados{
	public static void main(String[] args) {
		int a[], i;
		
		a = new int [11];
				
		for(i=0; i<11; i++) {
			a[i]= (int)Math.pow(2, i);
			System.out.println(a[i]);
		}
	}
}