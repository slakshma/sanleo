import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;


public class FindFirstDistinctChar {

	public FindFirstDistinctChar() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "total";
		char[] cha = str.toCharArray();
		int[] ia = new int[128];
		ia['t'] = 2;
		Map<Character, Integer> cm = new LinkedHashMap<Character, Integer>();
		cm.put('t', 2);
		cm.put('o', 1);
		cm.put('a', 1);
		cm.put('l', 1);
		Iterator<Character> it = cm.keySet().iterator();
		while (it.hasNext()) {
			Character c = it.next();
			if (cm.get(c) == 1) {
				System.out.println(c);
				break;
			}
		}
		
		int p = 18;
		if ((p & (p - 1)) == 0) {
			System.out.println("Power of 2");
		}
			
		

	}

}
