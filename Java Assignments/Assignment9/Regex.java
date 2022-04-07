/*Using the documentation for java.util.regex.Pattern as a resource, write and test a regular expression that checks a sentence to see that 
it begins with a capital letter and ends with a period.*/

import java.util.regex.*;
import java.util.*;
public class Regex{
	public static void main(String args[]){
		String str;
		Scanner s= new Scanner(System.in);
		str=s.nextLine();
		if(Pattern.matches("[A-Z].*\\.",str))
			System.out.println("satisfied given conditions");
		else
			System.out.println("not satisfied given conditions");

		}
}

