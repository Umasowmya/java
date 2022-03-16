interface Cycle{
	void code();
	void factory();

}
class Unicycle implements Cycle{
	public void code(){
		factory();
	}
	public void factory(){
		System.out.println("In Unicycle factory");
	}

}
class Bicycle implements Cycle{
	public void code(){
		factory();
	}
	public void factory(){
		System.out.println("In Bicycle factory");
	}
}
class Tricycle implements Cycle{
	public void code(){
		factory();
	}
	public void factory(){
		System.out.println("In Tricycle factory");
	}
}
public class Seven_Four {
	public static void main(String[] args){
		Unicycle obj = new Unicycle();
		obj.code();
		Bicycle obj1 = new Bicycle();
		obj1.code();
		Tricycle obj2 = new Tricycle();
		obj2.code();
	}
}