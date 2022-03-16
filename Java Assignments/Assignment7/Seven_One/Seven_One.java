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