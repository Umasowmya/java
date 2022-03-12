import java.util.*;
public class Project6_1_Sum {
    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner s=new Scanner(System.in);
        for(int i=0;i<5;i++)
            arr.add(s.nextInt());

        sumOfElements(arr);
    }

    public static void sumOfElements(ArrayList<Integer> arr){
        int sum=0;
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
        }
        System.out.println("Sum of elements is "+sum);

    }
}
