package uma.assignment.singleton;
import java.util.*;
public class Main2{
	String str;
		Main2(String s){
		str=s;
	}
	
	public static Main2 Main(String s) {
		str=s;
		Main2 m = new Main2(s);
		return m;
	}
	public void printString() {
		System.out.println(str);
	}

	public static void main(String[] args)
	{
	String str = "uma";
	Main2 m = new Main2(str);
	m.Main(str);
	m.printString();
	}

}