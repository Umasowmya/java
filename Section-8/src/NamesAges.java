import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class NamesAges {
    public static void main(String args[]) {
        Scanner namesFile;
        Scanner agesFile;
        PrintWriter namesAges;
        try {

            namesFile = new Scanner(new File("names.txt"));
            agesFile = new Scanner(new File("ages.txt"));
            namesAges = new PrintWriter("namesAges.txt");

            String name;
            int age;

            while (namesFile.hasNext()) {
                name = namesFile.nextLine();
                age = agesFile.nextInt();
                namesAges.println(name + " is " + age + " years old");
            }
            namesAges.close();
            agesFile.close();
            namesFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
