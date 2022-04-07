/*5. Create a class with an inner class that has a non-default constructor (one that takes arguments). 
Create a second class with an inner class that inherits from the first inner class.*/

class A{
	A(int a){
		System.out.println(a);
		System.out.println("class A");
	    }
	class A1{
		A1( ){
			System.out.println("inside A1");
		          }
		}
}

class B extends A.A1{
	B(A obj){
		obj.super();
	   }
	
	class B1{
	}
}

public class Seven_Five{
	public static void main(String[] args){
		A a=new A(2);
		B b=new A(a);
		
	} 

}

