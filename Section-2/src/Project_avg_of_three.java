import java.util.Scanner;

public class Project_avg_of_three {
    public static void main(String args[]) {
        double num1,num2,num3,average;
        Scanner s= new Scanner(System.in);
        num1=s.nextDouble();
        num2=s.nextDouble();
        num3=s.nextDouble();
        average=(num1+num2+num2)/3;
        System.out.println("average is "+average);
    }
}
