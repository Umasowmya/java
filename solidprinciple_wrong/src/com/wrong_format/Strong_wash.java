package com.wrong_format;

public class Strong_wash extends Normal_wash implements Wash_class{
    int time;
    @Override
    public void provide_pairs(int pairs){
        time=pairs*20;
        System.out.println("pairs are"+pairs);
    }
   public int  get_timeS(){
        return time;
   }

   @Override
    public void provide_detergent(){

    }
    public int get_time(){

        return time;
    }


    public void provide_fragrance(){}

// Liskov substitution principle is violated

    public String wash(String mode,int repetitions){
        return "cannot be executed";
    }

    public  String  wash(String mode){
        if (mode=="strong")
            System.out.println("strong mode is selected");
        else
            System.out.println("wrong mode");

        return "success";
    }

}
