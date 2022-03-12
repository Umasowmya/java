import java.util.Scanner;

public class Project4_1_Arrays {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<5;i++)
            arr[i]=s.nextInt();
        for(int i=0;i<arr.length;i++)
            System.out.println(2*arr[i]);
    }
}