import java.util.*;
interface One{
	public void read1();
	public void print1();
}
interface Two{
	public void read2();
	public void write2();
}
interface Three{
	public void read3();
	public void write3();

}
interface Four implements One,Two,Three{
	public void read4();

}
class concrete{
	concrete(){
		System.out.prinltn("concrete");
	}
	
	public void display(){
		System.out.println("in concretec class");
	}
}

class Five implements Four extends concrete{
	public void read1(){
		System.out.println("read1");
	}
	public void write1{
		System.out.println("write1");
	}
	public void read2(){
		System.out.println("read2");
	}
	public void write2(){
		System.out.println("write2");
	}
	public void read3(){
		System.out.println("read3");
	}
	public void write3(){
		System.out.println("write3");
	}
	public void read4(){
		System.out.println("read4");
	}
}

class Seven_Three {

	static void method1(Interface1 i) {
	};
	static void method2(Interface2 i) {
	};
	static void method3(Interface3 i) {
	};
	static void method4(Newinterface i) {
	};

	public static void main(String[] args) {
		Five f = new Five();
		String str;
		Scanner s = new Scanner(System.in);
		System.out.println("enter interface number");
		str = s.nextLine();
		f.method1(st);
		f.method2(st);
		f.method3(st);
		f.method4(st);
		
	}
}