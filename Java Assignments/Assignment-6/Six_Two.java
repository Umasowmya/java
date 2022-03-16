import java.util.*;
public class Six_Two{
	int n;
	Six_Two(){
		System.out.println("Constructor 1");
		
	}

	Six_Two(int n){
		this();
		System.out.println(n);
	}

	public static void main(String args[]){
		Six_Two s=new Six_Two(6);
}
}