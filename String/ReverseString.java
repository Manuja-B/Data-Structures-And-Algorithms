public class ReverseString {
	
	    public static void reverseString(char[] s) {
	       helper(0,s);
	    }
	    private static void helper(int index, char[] str){
	        if(str==null || index>=str.length){
	            return;    
	        }
	        helper(index+1, str);
	        System.out.print(str[index]);
	    }
	    public static void main(String args[]) {
	    	String str = "Hi There";
	    	char[] arr = str.toCharArray();
	    	reverseString(arr);
	    }
	
}
