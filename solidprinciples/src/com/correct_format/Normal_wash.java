package com.correct_format;

public class Normal_wash  implements Wash_interface,Normal_interface, Estimate_time {
    int pairs;
    public void provide_pairs(int pairs){
        this.pairs=pairs;
        System.out.println("pairs are"+pairs);
    }

    public void provide_detergent(){
        //detergent is added
    }
    public void provide_fragrance(){
        //fragrance is added(like comfort)
    }

    @Override
    public int estimate_time() {
        int time=10*pairs;
        return time;
    }


    public  String  normal_wash(String mode,int repetitions){
        if (mode=="normal")
            System.out.println("normal mode is selected");
        else
            System.out.println("wrong mode");


        return "succesfully washed";
    }
}
