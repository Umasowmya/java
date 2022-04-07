/*3. Create three interfaces, each with two methods. Inherit a new interface that combines the three, adding a new method. Create a class by implementing the new interface and also inheriting from a concrete class. Now write four methods, each of which takes one of the four interfaces as an argument. 
In main( ), create an object of your class and pass it to each of the methods.

*/

interface A
{
	void read1();
	void write1();
}
interface B
{
	void read2();
	void write2();
}
interface C
{
	void read3();
	void write3();
}
interface D extends A,B,C
{
	void write4();
}
class Sub_class  extends Base_class  implements D
{
	public void read1()
	{
		System.out.println("in read1 method");
	}
	public void write1()
	{
		System.out.println("in write1 method");	
	}
	public void read2()
	{
		System.out.println("in read2 method");
	}
	public void write2()
	{
		System.out.println("in write2 method");	
	}
	public void read3()
	{
		System.out.println("in read3 method");
	}
	public void write3()
	{
		System.out.println("in write3 method");	
	}
	public void write4()
	{
		System.out.println("in write4 method");	
	}
	
	
	void method_one(A obj)
	{
		System.out.println("In method one");
	}
	void method_two(B obj)
	{
		System.out.println("In method two");
	}
	void method_three(C obj)
	{
		System.out.println("In method three");
	}
	void method_four(D obj)
	{
		System.out.println("In method four");
	}
}
public class Base_class
{
	public static void main(String[] ags)
	{
		Sub_class  obj = new Sub_class();
		obj.method_one(obj);
		obj.method_two(obj);
		obj.method_three(obj);
		obj.method_four(obj);
	}
}