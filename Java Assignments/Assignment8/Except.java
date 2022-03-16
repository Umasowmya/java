import java.util.*;
public class Except{
	static int flag=0;
	public void onemethod(){
		int c=1/0;
		int a[]=new int[5];		
		a[5]=10;
		String s=null;
		System.out.println(s.length());
	   	flag=1;
		

	}


	public static void main(String args[]){
		Except  obj= new Except();
		while(flag!=1){
		try{
		
			obj.onemethod();
		}
		catch(Exception e){
		System.out.println(e);
	       	}
		}
		finally{
		System.out.println("finally is executed");
		}
	}
		
}
