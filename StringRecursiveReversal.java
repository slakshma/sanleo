
public class StringRecursiveReversal {
 
    String reverse = "";
     
    public String reverseString(String str){
         
        if(str.length() == 1){
            return str;
        } else {
            reverse += str.charAt(str.length()-1)
                    +reverseString(str.substring(0,str.length()-1));
            return reverse;
        }
    }
     
    public static void main(String a[]){
        StringRecursiveReversal srr = new StringRecursiveReversal();
        System.out.println("Result: "+srr.reverseString("ABCD"));
        
        char[] ch = new char[]{'s', 'e', 'n', '\0', 'i'};
        System.out.println(new String(ch));
        
        int[] i = new int[]{1, 2,3, '\0'};
        System.out.println(i.length);
    }
}