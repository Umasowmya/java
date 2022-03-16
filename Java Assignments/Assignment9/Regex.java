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

