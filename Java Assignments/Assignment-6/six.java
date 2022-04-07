/*. Create a class with a constructor that takes a String argument. 
During construction, print the argument. Create an array of object references 
to this class, but don’t actually create objects to assign into the array. 
When you run the program, notice whether the initialization messages from the constructor calls are printed.
*/

import java.util.*;
public class six{
	public String s;
	six(String str){
		s=str;
		System.out.println(s);
	}
	

	public static void main(String args[]){
		six s[] = new six[2];
		s[0]=new six("uma");
		s[1]=new six("sowmya");
		}
}


	