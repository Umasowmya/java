import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class Project8_2_CircleFile {
    public static void main(String args[]){
    Scanner input;
    Scanner output;
    ArrayList<Double> area = new ArrayList<>();

    try{
        input = new Scanner(new File("circle_data.txt"));
        int radius;

        while(input.hasNext()){
            radius=input.nextInt();
            Circle temp=new Circle(radius);
            area.add(temp.get_area());
        }
        input.close();

        }
    catch(FileNotFoundException e){
        e.printStackTrace();
        System.out.println("file not found");
        }

        for(double i: area)
            System.out.println("area is "+i);
    }


}
