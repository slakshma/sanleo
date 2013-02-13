
public class Maxsubarraysum {

	public Maxsubarraysum() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[] intArr = {-5, 2, 3, 4, 5, -2, -10};
		System.out.println(findMaxSubArray2(intArr, intArr.length));
		}
	
	public static int findMaxSubArray2(int a[], int size)
	{
	   int max_so_far = 0, max_ending_here = 0;
	   int i;
	   for(i = 0; i < size; i++)
	   {
	     max_ending_here = max_ending_here + a[i];
	     if(max_ending_here < 0)
	        max_ending_here = 0;
	     if(max_so_far < max_ending_here)
	        max_so_far = max_ending_here;
	    }
	    return max_so_far;
	} 
		 
		public static void findMaxSubArray(int[] inputArray){
		 
		int maxStartIndex=0;
		int maxEndIndex=0;
		int maxSum = Integer.MIN_VALUE;
		 
		int cumulativeSum= 0;
		int maxStartIndexUntilNow=0;
		for (int currentIndex = 0; currentIndex < inputArray.length; currentIndex++) {
			int eachArrayItem = inputArray[currentIndex];
			cumulativeSum += eachArrayItem;
			 
			if(cumulativeSum > maxSum){
				maxSum = cumulativeSum;
				maxStartIndex = maxStartIndexUntilNow;
				maxEndIndex = currentIndex;
			}
			else if (cumulativeSum < 0){
				maxStartIndexUntilNow = currentIndex+1;
				cumulativeSum=0;
			}
		}
		 
		System.out.println("Max sum : "+maxSum);
		System.out.println("Max start index : "+maxStartIndex);
		System.out.println("Max end index : "+maxEndIndex);
		}

}
