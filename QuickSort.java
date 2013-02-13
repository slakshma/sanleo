
public class QuickSort {

	public QuickSort() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {6, 2,7, 3, 9, 1, 5};
		QuickSort qs = new QuickSort();
		qs.quicksortOptimized(a);
		for (int i : a) {
			System.out.println(i);
		}

	}
	
    public void quicksortOptimized( int[] data ){
        quicksortOptimized( data, 0, data.length - 1 );
    }
    public void quicksortOptimized( int[] data, int left, int right ){
       int pivotValue = data[ ( left + right ) / 2 ];
       int i = left;
       int j = right;

       while( i <= j ){
           // Find leftmost value greater than or equal to the pivot.
           while( data[i] < pivotValue ) i++;

           // Find rightmost value less than or equal to the pivot.
           while( data[j] > pivotValue) j--;

           // If the values are in the wrong order, swap them.
           if( i <= j ){
               swap( data, i, j );
               i++;
               j--;
           }
       }
       
    // Apply the algorithm to the partitions we made, if any.

       if( left < j ){
           quicksortOptimized( data, left, j );
       }

       if( i < right ){
           quicksortOptimized( data, i, right );
       }
    }

	private void swap(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
		
	}




}
