package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
	    Map <Character,Integer> map = new HashMap<>();
        try{
            Scanner s= new Scanner(new File("input.txt"));
            while(s.hasNext()){
                   char[] ch =s.next().toCharArray();
                for (char c : ch) {
                    if (map.containsKey(c))
                        map.put(c, map.get(c) + 1);
                    else
                        map.put(c, 1);
                }

                s.nextLine();
            }

            s.close();

            PrintWriter pw = new PrintWriter("output.txt");


            for (Map.Entry entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
                pw.println(entry.getKey()+" "+entry.getValue());
            }

            pw.close();
        }

        catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println(e);
        }


    }
}
