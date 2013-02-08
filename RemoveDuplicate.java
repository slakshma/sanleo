

public class RemoveDuplicate {

	public RemoveDuplicate() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = new int[]{4, 8, 4, 1, 1, 2, 9};
		a = removeDuplicates(a);
	    for (int i: a) {
	    	System.out.println(i);
	    }
	    

	}

	 public static int[] removeDuplicates(int[] a) {
	   int i = 0;
	   int numOfDuplicates = 0;
	   while ( i < a.length) {
	       
	       boolean duplicate = false;
	       int j = i + 1;
	       for (; j < a.length; j++) {
	           if (a[i] != '\0' && a[j] == a[i]) {
	               //a[i] has duplicate
	               duplicate = true;
	               numOfDuplicates++;
	               break;
	           }
	       }
	       
	       if (duplicate) {
	          //shift the contents in array
	           j = i;
	           while ( i < a.length - 1) {
	              a[i] = a[++i];
	           }
	           
	           a[i] = '\0'; //last item
	           i = j-1;
	       }
	       
	       i++;
	   
	   }
	   int[] b = new int[a.length-numOfDuplicates];
	   System.arraycopy(a, 0, b, 0, a.length - numOfDuplicates);
	  return b;
	   
	 }

	

}
