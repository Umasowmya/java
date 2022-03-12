import java.util.*;
public class NamePermutations {
    public static void main(String args[]) {
        String full_names[] = new String[5];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
            full_names[i] = s.nextLine();
        ArrayList<String> fname = new ArrayList<>();
        ArrayList<String> lname = new ArrayList<>();

        for(int i=0;i<5;i++){
            fname.add(full_names[i].substring(0,full_names[i].indexOf(" ")));
            lname.add(full_names[i].substring(full_names[i].indexOf(" ")));

        }
        System.out.println("permutations are");

        for(int i=0;i<fname.size();i++){
            for(int j=0;j<lname.size();j++){
                System.out.println(fname.get(i)+lname.get(j));
            }
        }
    }
}
