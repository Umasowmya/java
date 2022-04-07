/*Write a java function that checks if the input string contains all the letters of the alphabet a-z (case-insensitive). Write time and space 
complexity of your solution as comments in the source file.*/
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.*;
public class Main {
    public static void main(String args[]) {
           	Scanner s =new Scanner(System.in);
            	System.out.println("enter string");
            	String str=s.nextLine();
            	int flag = 0;
           	Boolean b[] = new Boolean[26];
           	for(int i=0;i<26;i++)
                   	    b[i]=false;
        	str = str.toLowerCase();
        	for (int i = 0; i < str.length(); i++) {
            		if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
               			 b[str.charAt(i) - 'a'] = true;
        	}
        	for (int i = 0; i < 26; i++) {
            		if (b[i] == false) {
                			System.out.println("Not contains every character");
               			 flag = 1;
                			break;
            		}
        	}

        if (flag==0)
            System.out.println("contains every character");
    }
    
}
