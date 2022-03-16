package uma.assingment.main;
import uma.assignment.data.*;
import uma.assignment.singleton.*;

public class Main3 {

	public static void main(String[] args) {
		Main1 m1 =new Main1();
		m1.getVal();
		m1.Print();
		Main2 m2= new Main2("str");
		m2.Main("str");
		Main2.printString();
		
	}

}