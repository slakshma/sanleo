import java.util.Stack;


public class Recursion {
	private static Stack<Integer> s = new Stack<Integer>();
	public static void doit(int i) {
		if (i == 0) return;
		else {
			doit(i-1);
			System.out.println(i);
		}
	}
	
	public static void doit2(int i) {
		s.add(i--);
		boolean done = false;
		while (!s.empty()) {
			if (done) {
				System.out.println(s.pop());
			} else {
				s.add(i--);
				if (i == 0) {
					done = true;
				}
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Recursion r = new Recursion();
		r.doit2(3);
		
	}
	
}
