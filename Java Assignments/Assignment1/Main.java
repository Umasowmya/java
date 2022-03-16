import java.io.File;
import java.util.regex.*;
import java.util.Scanner;
public class Main {
       public static void main(String args[]){
       Scanner s= new Scanner(System.in);
        String str;
        File f = new File("C:/Users/Chandana Sri/Desktop");
        String[] lisOfFiles=f.list();
        while(true) {
            int flag=0;
            System.out.println("enter file name");
            str=s.nextLine();
            for(String st : lisOfFiles){
                	if(Pattern.matches(str,st) ){
                    	flag = 1;
                    	System.out.println("file found");
                    	System.out.println("path" + f.getAbsolutePath());
		break;
                	         }
            }

            if(flag==0)
                System.out.println("file not found");


        }

    }
   
}