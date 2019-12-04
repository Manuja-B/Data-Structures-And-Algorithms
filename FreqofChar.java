import java.util.Arrays;
import java.util.Scanner;
public class FreqofChar {
	
	public static void main(String args[])
	   {
	        int ci, i, j, k, l=0;
	        String str, str1;
	        char c, ch;
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.print("Enter a String : ");
	        str=scan.nextLine();
	        String[] s = new String[10];
	        i=str.length();
	        for(c='A'; c<='z'; c++)
	        {
	            k=0;
	            for(j=0; j<i; j++)
	            {
	                ch = str.charAt(j);
	                if(ch == c)
	                {
	                    k++;
	                    s[j]=String.valueOf(c);
	                    
	                }
	            }
	            if(k>0)
	            {
	                System.out.println("The character " + c + " has occurred for " + k + " times");
	            }
	        }
	        //System.out.println("The string in alphabetical order is"+Arrays.deepToString(s));
	   }

}
