import java.lang.reflect.Array;
import java.math.BigInteger;


public class RemoveChars {

	public RemoveChars() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean[] f = new boolean[100];
		f['a'] = true;
		f['A'] = true;
		
		System.out.println(f['a']);
		
		char[] c = new char[100];
		c['a'] = 65;
		
		System.out.println(c['a']);
		
		int[] i = new int[100];
		i['a'] = 100;
		
		System.out.println(i[97]);
		
		System.out.println(removeChars("seeni", "ei"));
		
		String s = new String("seeni");
		char[] src = s.toCharArray();
		char[] dest = new char[s.length()];
		StringBuilder sb = new StringBuilder();
		//sb.deleteCharAt(index)
		System.arraycopy(src, 1, dest, 1, 4);
		System.out.println(new String(dest, 0, 4));
	}
	
	 public static String removeChars( String str, String remove ){
	        char[] s = str.toCharArray();
	        char[] r = remove.toCharArray();
	        int src, dst = 0;

	        // flags automatically initialized to false, size of 128 assumes ASCII
	        boolean[] flags = new boolean[128];

	        // Set flags for characters to be removed
	        for( src = 0; src < r.length; ++src ){
	        flags[r[src]] = true;
	        }

	        // Now loop through all the characters,
	        // copying only if they aren't flagged
	        for( src = 0; src < s.length; ++src ){
	            if( !flags[ s[src] ] ){
	                s[dst++] = s[src];
	            }
	        }
	        return new String( s, 0, dst );
	    }


}
