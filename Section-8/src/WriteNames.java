import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("uma");
        names.add("sowmya");
        names.add("raju");
        names.add("bhavani");
        names.add("sarada");
        try{
            PrintWriter pr=new PrintWriter("names.txt");
            for(String i:names){
                pr.println(i);
            }
            pr.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }


    }
}

