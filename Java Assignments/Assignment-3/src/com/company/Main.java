/*Write a java function that will ping any host ( given as input ) and computes the median of the time taken to ping.

Use the system ping utility, do not use any deprecated methods.
*/

package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main
{

    static void commands(ArrayList<String> commandList,int iter)
            throws Exception
    {

        ProcessBuilder build = new ProcessBuilder(commandList);
        Process process = build.start();

        BufferedReader input = new BufferedReader(new InputStreamReader
                (process.getInputStream()));
        BufferedReader Error = new BufferedReader(new InputStreamReader
                (process.getErrorStream()));
        String s = null;

        ArrayList<Double> a = new ArrayList<>();
        int i = 0;
        while((s = input.readLine()) != null && iter>0)
        {
            iter--;
            i++;
            if(i>2) {
                a.add(Double.valueOf(s.substring(41,43)));
            }
            System.out.println(s);
        }
         double median;
        if(a.size()%2==0)
            median=(a.get(a.size()/2)+a.get(a.size()/2+1))/2;
        else
            median=a.get(a.size()/2);
        System.out.println("median is  "+median);

        System.out.println("error (if any): ");
        while((s = Error.readLine()) != null)
        {
            System.out.println(s);
        }

    }


    public static void main(String args[]) throws Exception
    {
        ArrayList<String> commandList = new ArrayList<String>();
        commandList.add("ping");
        commandList.add("www.google.com");
        Main.commands(commandList,5);
    }
}

