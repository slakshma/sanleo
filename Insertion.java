/**
 * 
 */

/**
 * @author slakshma
 *
 */
public class Insertion {

	/**
	 * 
	 */
	public Insertion() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = new int[]{6, 4, 1, 5, 8, 2, 9, 3};
		
		for (int i=1; i < a.length; i++) {
			int x = a[i];
			int j;
			for (j = i; j > 0 && x < a[j-1]; j--) {
				  a[j] = a[j-1];
			}
			a[j] = x;
		}
		
		for (int k=0; k < a.length; k++) {
			System.out.println(a[k]);
		}

	}

}
