/*2. Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
 Add a balance( ) method to Unicycle and Bicycle, but not to Tricycle. 
Create instances of all three types and upcast them to an array of Cycle. 
Try to call balance( ) on each element of the array and observe the results. 
Downcast and call balance( ) and observe what happens.*/


abstract class Cycle{
	public abstract void balance();
}
class Unicycle extends Cycle{
	public void balance(){
		System.out.println("Unicycle class");
	}
}
class Bicycle extends Cycle{
	public void balance(){
		System.out.println("Bicycle class");
	}
}

//error :tricycle class is an abstract class hence cannot instantiate
class Tricycle extends Cycle{
}
public class Seven_Two{
	public static void main(String[] args) {
		Cycle[] obj = new Cycle[3];
		obj[0] = new Unicycle();
		obj[0].balance();	
		obj[1] = new Bicycle();
		obj[1].balance();	
		obj[2] = new Tricycle();
		obj[2].balance();
	}
}