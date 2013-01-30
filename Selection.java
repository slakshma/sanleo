/**
 * 
 */

/**
 * @author slakshma
 *
 */
public class Selection {

	/**
	 * 
	 */
	public Selection() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = new int[]{6, 4, 1, 5, 8, 2, 9, 3};
		int swapCount = 0;
		for(int i = 0; i < a.length; i++) {
			int minIndex = i;
			//find next min
			for (int j = i+1; j < a.length; j++) {
				if (a[j] < a[minIndex]) {
					minIndex = j;
				}
			}
			//swap
			if (minIndex != i) {
				int temp = a[minIndex];
				a[minIndex] = a[i];
				a[i] = temp;
				swapCount++;
			}
		}
		System.out.println("swap count ="+swapCount);
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
		

	}

}
