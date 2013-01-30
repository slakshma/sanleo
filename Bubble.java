/**
 * 
 */

/**
 * @author slakshma
 *
 */
public class Bubble {

	/**
	 * 
	 */
	public Bubble() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arr = new int[] {6, 4, 1, 5, 8, 2, 9, 3};
		
		int count = 0;
		
		for (int i=0; i < arr.length; i++) {
			
			for (int j = arr.length-1; j > i; j--) //this will have less number of swaping!!!
			//for (int j = i+1; j < arr.length; j++)
			{
				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					count++;
				}
				
			}
			
		}
		
		System.out.println("swap count="+count);
		
		for (int k : arr) {
			System.out.println(k);
		}
		

	}

}
