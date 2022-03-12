import java.util.*;
public class FunWith2DArrays {
    public static void main(String args[]){
        int[][] arr=new int[2][2];
        fill_array(arr);
        display_array(arr);
    }

    public static void fill_array(int[][] arr){
        Scanner s =new Scanner(System.in);
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                arr[i][j]=s.nextInt();


    }

    public static  void display_array(int[][] arr  ){
        for(int[] list :arr) {
            for (int i : list)
                System.out.print(i+" ");

            System.out.println();
        }


    }
}
