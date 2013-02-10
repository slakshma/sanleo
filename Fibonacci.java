
public class Fibonacci {

	public Fibonacci() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public int fib(int num) {
		
		if (num <= 1) {
			return num;
			
		} else {
			 return fib(num - 1) + fib (num -2);
			
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		int i = 0;
		while (i < 5) {
			System.out.println(f.fib(i));
			i++;
		}
		
		
		 
		

	}

}
