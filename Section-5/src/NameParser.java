import java.util.*;
public class NameParser {
    public static void main(String args[]){
        Scanner s= new  Scanner(System.in);
        String full_name=s.nextLine();
        System.out.println(full_name);
        String fname = full_name.substring(0,3);
        String lname = full_name.substring(4,full_name.length());

        String upper=full_name.toUpperCase();
        String lower=full_name.toLowerCase();

        System.out.println("upper case "+upper);
        System.out.println("lower case "+lower);
        System.out.println("first name is "+fname);
        System.out.println("last name is "+lname);
    }
}
