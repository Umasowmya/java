/*1. Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,etc. 
In the base class, provide methods that are common to all Rodents, and override 
these in the derived classes to perform different behaviors depending on the specific type of Rodent. Create an array of Rodent, fill it with different specific types of Rodents, and call your base-class methods to see what happens. Make the methods of Rodent abstract whenever possible and all classes should have default constructors that print a message about that class.
 
*/

import java.util.*;
abstract class Rodent{
	Rodent(){
		System.out.println("rodent class");
	}
	
	public abstract void color();
	public abstract void legs();
}

 class Mouse extends Rodent{
	Mouse(){
		System.out.println("Mouse class");
	}
	
	public void color(){
		System.out.println("Mouse is black color");
		}
	public void legs(){
		System.out.println("4 legs");
	}
}

 class Gerbil extends Rodent{
	 Gerbil (){
		System.out.println(" Gerbil class ");
	}
	
	public void color(){
		System.out.println(" Gerbil  is red color");
		}
	public void legs(){
		System.out.println("3 legs");
	}
}

 class Hamster extends Rodent{
	Hamster(){
		System.out.println("Hamster class");
	}
	
	public void color(){
		System.out.println("Hamsteris blue color");
		}
	public void legs(){
		System.out.println("2 legs");
	}
}

public class  Seven_One{
	public static void main(String args[]){
		Rodent r[]=new Rodent[3];
		r[0]=new Mouse();
		r[0].color();
		r[0].legs();
		r[1]=new Gerbil();
		r[1].color();
		r[1].legs();
		r[2]=new Hamster();
		r[2].color();
		r[2].legs();

	}
}