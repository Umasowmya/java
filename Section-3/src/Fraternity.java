import java.util.*;
public class Fraternity {
    public static void main(String[] args) {
        char gender;
        int age;
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your Age?");
        age=scanner.nextInt();
        System.out.println("What is your gender ");
        gender=scanner.next().charAt(0);
        if(age>=19 && gender=='M'){
            System.out.print("You are eligible to join the fraternity");
        }
        else{
            System.out.println("not eligible for fraterniry");
        }


    }
}
