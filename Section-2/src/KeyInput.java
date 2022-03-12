import java.util.Scanner;

public class KeyInput {
    public static void main(String args[]) {
        String name;
        int age;

        Scanner s= new Scanner(System.in);
        name=s.next();
        age=s.nextInt();
        System.out.println("name "+name);
        System.out.println("age "+age);
    }
}
