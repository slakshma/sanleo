
public class TelephoneNumber {
      private static final int PHONE_NUMBER_LENGTH = 7;
      private final int [] phoneNum;
      private char[] result = new char[ PHONE_NUMBER_LENGTH ];

      public TelephoneNumber ( int[] n ) { phoneNum = n; }

      public void printWords(){ printWords( 0 ); }

      private void printWords(int curDigit ) {
          if( curDigit == PHONE_NUMBER_LENGTH ) {
              System.out.println( new String( result ) );
              return;
          }
          for( int i = 1; i <= 3; ++i ) {
              result[ curDigit ] = getCharKey( phoneNum[curDigit], i );
              printWords( curDigit + 1 );
              if( phoneNum[curDigit] == 0 ||
                  phoneNum[curDigit] == 1) return;
          }
      }

	private char getCharKey(int num, int i) {
		char[][] alpha = {
				{'0'},
			    {'1'},
			    {'a','b','c'},
			    {'d','e','f'},
			    {'g','h','i'},
			    {'j','k','l'},
			    {'m','n','o'},
			    {'p','q','r'},
			    {'s','t','u','v'},
			    {'w','x','y','z'},	
			};
		return alpha[num][i-1];
	}
	
	public static void main(String[] args) {
		int[] n = {9, 9, 9, 1, 5, 6, 3};
		TelephoneNumber tn = new TelephoneNumber(n);
		tn.printWords();
		
	}
	
	
   }
