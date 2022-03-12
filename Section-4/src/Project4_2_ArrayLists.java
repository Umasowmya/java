import java.util.Collection;
import java.util.Scanner;
import java.util.ArrayList;
public class Project4_2_ArrayLists{
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        ArrayList<Double> a = new ArrayList<>();
        double input;
        input=s.nextDouble();
        while(input>=0){
            a.add(input);
            System.out.println("enter 0 or more number to give input or negative number to exit");
            input=s.nextDouble();
        }

        for(int i=a.size()-1;i>=0;i--)
            System.out.println(a.get(i));
    }
}