import java.util.*;
public class StringMethods2 {
    public static void main(String args[]){
        String myName="Uma Sowmya";

        String upper = myName.toUpperCase();
        String lower = myName.toLowerCase();

        int index=myName.indexOf("S");
        String lastName = myName.substring(4);

        System.out.println("upper case "+upper);
        System.out.println("lower case "+lower);
        System.out.println("index of S is "+index);
        System.out.println("last name is "+lastName);


    }
}
