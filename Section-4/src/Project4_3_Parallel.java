import java.util.*;
public class Project4_3_Parallel {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        ArrayList<String> name= new ArrayList<>();
        ArrayList<Integer> age= new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            name.add(s.next());
            age.add(s.nextInt());
        }

        for(int i=0;i<5;i++){
            System.out.println(name.get(i)+" is of "+age.get(i)+" years old");
        }
    }
}
