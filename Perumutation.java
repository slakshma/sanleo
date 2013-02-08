
public class Perumutation {

	private StringBuilder sb;
	
	public static int count = 0;
	
	public Perumutation(String word) {
		sb = new StringBuilder(word);
	}
	
	
	private void swap(int i, int j) {
		char ich = sb.charAt(i);
		char jch = sb.charAt(j);
		sb.setCharAt(i, jch);
		sb.setCharAt(j, ich);
	}
	
	public void perm(int i, int n) {
		  int j;
		  if (i == n)
		     System.out.println(sb);
		   else
		   {
		        for (j = i; j <= n; j++)
		       {
		          swap(i, j);
		          perm(i+1, n);
		          swap(i, j); //backtrack
		       }
		   }
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Perumutation p = new Perumutation("ABC");
	//	p.perm(0, 2);
		
		permutation("ABCD");
		
		String s = "seeni";
		System.out.println(s.replace("s",""));
		StringBuilder sb = new StringBuilder();
		//sb.setCharAt(index, ch)
	}
	
	public  static void permutation(String str) { 
	    permutation("", str); 
	 }

	 private static void permutation(String prefix, String str) {
	   //System.out.println("Prefix:"+prefix+" ,str:"+str);
		 int n = str.length();
	    if (n == 0) {
	    	System.out.println(prefix + ", count:"+count++);
	    }
	    else {
	        for (int i = 0; i < n; i++) {
	        	System.out.println("i="+i+", prefix:"+prefix+", str:"+str);
	           permutation(prefix + str.charAt(i), 
	        		   str.substring(0, i) + str.substring(i+1, n));
	        }
	    }

	}
	 
	 

}
