import java.util.*;
public class StringMethods {
    public static void main(String args[]){
        String fname="uma";
        String lname="sowmya";
        int i;
        for(i=0;i<fname.length();i++)
            System.out.print(fname.charAt(i));
        System.out.println();
        for(i=0;i<lname.length();i++)
            System.out.print(lname.charAt(i));
        System.out.println();

        if(fname.equals(lname))
            System.out.println("equal");
        else
            System.out.println("not equal");

        if(fname.compareTo(lname)>0)
            System.out.println("not equal");
        else
            System.out.println("equal");
    }
}
