package com.wrong_format;

public class Normal_wash<time> implements Wash_class{
    int time;
    public void provide_pairs(int pairs){
        time=pairs*10;
        System.out.println("pairs are  "+pairs);
    }

    public int get_timeN(){
        return time;
    }

    public void provide_detergent(){
        //detergent is addedd
    }
    public void provide_fragrance(){
        //fragrance is added(like comfort)
    }

    public int get_time(){

        return time;
    }


    //Liskov principle is violated because of method is changed and parent method cannot be substituted by child method.

    public  String  wash(String mode, int repetitions ){
        if (mode=="normal")
            System.out.println("normal mode is selected");
        else
            System.out.println("wrong mode");
        while(repetitions>0){
            //washing clothes
            repetitions--;
        }
        return "succesfully washed";
    }

    public String wash(String mode){
        return "cannot executed";
    }

}
